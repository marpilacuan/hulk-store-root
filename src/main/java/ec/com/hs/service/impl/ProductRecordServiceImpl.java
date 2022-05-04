/**
 * 
 */
package ec.com.hs.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.com.hs.model.ProductRecordEntity;
import ec.com.hs.repository.IProductRecordRepository;
import ec.com.hs.service.IProductRecordService;
import ec.com.hs.vo.ProductRecordVo;
import lombok.extern.slf4j.Slf4j;

/**
 * Product record service implementation.
 * 
 * @author mpilacuan
 *
 */
@Service
@Slf4j
public class ProductRecordServiceImpl implements IProductRecordService {

	@Autowired
	private IProductRecordRepository productRecordRepository;

	@Override
	public Collection<ProductRecordEntity> findRecordByIdProduct(Long idProduct) {
		return productRecordRepository.findAllByIdProduct(idProduct);
	}

	@Override
	public ProductRecordVo createOrUpdate(ProductRecordVo productRecordVo) {
		ProductRecordEntity productRecordEntity = new ProductRecordEntity();
		productRecordEntity.setId(productRecordVo.getId());
		productRecordEntity.setIdProduct(productRecordVo.getIdProduct());
		productRecordEntity.setTypeRecord(productRecordVo.getTypeRecord());
		productRecordEntity.setDateRecord(transformDate(productRecordVo.getDateRecord()));
		productRecordEntity.setTotalItems(productRecordVo.getTotalItems());
		productRecordRepository.save(productRecordEntity);
		return new ProductRecordVo(productRecordEntity.getId(), productRecordEntity.getIdProduct(),
				productRecordEntity.getTypeRecord(), transformDateString(productRecordEntity.getDateRecord()),
				productRecordEntity.getTotalItems());
	}

	private Date transformDate(String dateSend) {
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(dateSend);
		} catch (ParseException e) {
			log.error(e.getMessage());
		}
		return new Date();
	}

	private String transformDateString(Date dateSend) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(dateSend);
	}

}
