package painel.adm

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PainelServiceSpec extends Specification {

    PainelService painelService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Painel(...).save(flush: true, failOnError: true)
        //new Painel(...).save(flush: true, failOnError: true)
        //Painel painel = new Painel(...).save(flush: true, failOnError: true)
        //new Painel(...).save(flush: true, failOnError: true)
        //new Painel(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //painel.id
    }

    void "test get"() {
        setupData()

        expect:
        painelService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Painel> painelList = painelService.list(max: 2, offset: 2)

        then:
        painelList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        painelService.count() == 5
    }

    void "test delete"() {
        Long painelId = setupData()

        expect:
        painelService.count() == 5

        when:
        painelService.delete(painelId)
        sessionFactory.currentSession.flush()

        then:
        painelService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Painel painel = new Painel()
        painelService.save(painel)

        then:
        painel.id != null
    }
}
