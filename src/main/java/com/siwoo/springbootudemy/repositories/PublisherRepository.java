package com.siwoo.springbootudemy.repositories;

import com.siwoo.springbootudemy.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sm123tt@gmail.com on 2018-09-09
 * Project : springbootudemy
 * Github : http://github.com/Siwoo-Kim
 */

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
