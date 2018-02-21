package com.key.licence.Core.parsers;

/**
 * Created by jrafa on 2/4/2018.
 */
public interface IParser<E, D> {
    D parserEntityToDto(E entity);
    E parserDtoToEntity(D dto);
}
