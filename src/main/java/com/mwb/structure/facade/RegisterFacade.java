package com.mwb.structure.facade;

/**
 * 办理注册公司流程的门面对象
 *
 * @author mwb
 *         外观模式（Facade）
 *         外观模式是为了解决类与类之家的依赖关系的，像spring一样，
 *         可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的关系放在一个Facade类中，
 *         降低了类类之间的耦合度，该模式中没有涉及到接口，
 */
public class RegisterFacade {
    public void register() {
        工商局 a = new 海淀区工商局();
        a.checkName();
        质检局 b = new 海淀质检局();
        b.orgCodeCertificate();
        税务局 c = new 海淀税务局();
        c.taxCertificate();
        银行 d = new 中国工商银行();
        d.openAccount();
    }
}
