
package com.jx.blackface.gaea.usercenter.contract;

import java.util.List;

import com.jx.blackface.gaea.usercenter.entity.LvzMenuConfEntity;
import com.jx.spat.gaea.server.contract.annotation.OperationContract;
import com.jx.spat.gaea.server.contract.annotation.ServiceContract;


/**
 * @author bruce
 * @date 2016-06-27
 * @email zhangyang226@gmail.com
 * @site http://blog.northpark.cn | http://northpark.cn | orginazation https://github.com/jellyband
 * 
 */

@ServiceContract
public interface ILvzMenuConfService {


	@OperationContract
	public long addLvzMenuConfEntity(LvzMenuConfEntity e)throws Exception;
	@OperationContract
	public LvzMenuConfEntity getLvzMenuConfEntityById(long LvzMenuConfid)throws Exception; 
	@OperationContract
	public void delLvzMenuConfEntity(long id) throws Exception ;
	@OperationContract
	public List<LvzMenuConfEntity> getLvzMenuConfEntity(String condition,
			int pageindex,int pagesize,String orderby)throws Exception;
	@OperationContract
	public void updateLvzMenuConfEntity(LvzMenuConfEntity e)throws Exception;
	@OperationContract
	public int getCount(String condition)throws Exception;

}

