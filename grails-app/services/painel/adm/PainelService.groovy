package painel.adm

import grails.gorm.services.Service

@Service(Painel)
interface PainelService {

    Painel get(Serializable id)

    List<Painel> list(Map args)

    Long count()

    void delete(Serializable id)

    Painel save(Painel painel)

}