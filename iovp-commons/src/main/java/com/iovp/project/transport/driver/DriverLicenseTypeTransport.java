package com.iovp.project.transport.driver;

import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.base.pojo.vo.QueryVO;
import com.iovp.project.pojo.entity.driver.DriverLicenseType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <b>智慧公务车信息平台-驾驶证类型功能传输层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "iovp-system-provider")
@RequestMapping("/driverlicensetype/transport")
public interface DriverLicenseTypeTransport {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	PageVO<DriverLicenseType> getPageByQuery(@RequestBody QueryVO<DriverLicenseType> queryVO) throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	List<DriverLicenseType> getListByQuery(@RequestBody DriverLicenseType query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	boolean save(@RequestBody DriverLicenseType entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	boolean update(@RequestBody DriverLicenseType entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	DriverLicenseType getById(@RequestParam String id) throws Exception;

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	DriverLicenseType getByCode(@RequestParam String code) throws Exception;
}
