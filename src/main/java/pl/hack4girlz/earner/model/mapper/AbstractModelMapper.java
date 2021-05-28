package pl.hack4girlz.earner.model.mapper;

/**
 * Domain Object Mapper Interface
 * Created by mateusz.szablak on 04.06.2019
 */
interface AbstractModelMapper<T, S>
{
    T toDO(S source);
    S fromDO(T target);
}
