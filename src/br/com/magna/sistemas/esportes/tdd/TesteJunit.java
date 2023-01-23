package br.com.magna.sistemas.esportes.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.magna.sistemas.esportes.combate.Boxe;
import br.com.magna.sistemas.esportes.combate.Karate;
import br.com.magna.sistemas.esportes.combate.Esgrima;
import br.com.magna.sistemas.esportes.combate.Judo;
import br.com.magna.sistemas.esportes.combate.Mma;
import br.com.magna.sistemas.esportes.combate.MuayThai;
import br.com.magna.sistemas.esportes.combate.Taekwondo;
import br.com.magna.sistemas.esportes.enums.EnumCategoriaCurling;
import br.com.magna.sistemas.esportes.enums.EnumConferenciaDeBeisebol;
import br.com.magna.sistemas.esportes.enums.EnumConferenciasDeFutebolAmericano;
import br.com.magna.sistemas.esportes.enums.EnumEspecialidadeDoAtletaMma;
import br.com.magna.sistemas.esportes.enums.EnumEstilosDeCarate;
import br.com.magna.sistemas.esportes.enums.EnumEstilosDeJudo;
import br.com.magna.sistemas.esportes.enums.EnumEstilosDeMuayThai;
import br.com.magna.sistemas.esportes.enums.EnumEstilosDeTaekwondo;
import br.com.magna.sistemas.esportes.enums.EnumFederacoesDePoloAquatico;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeBadminton;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeBasquete;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeCriquete;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeFutvolei;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeGolfe;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeNadoSincronizado;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDePatinacaoArtistica;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeRugby;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeSurf;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeTenis;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeTenisDeMesa;
import br.com.magna.sistemas.esportes.enums.EnumModalidadeDeVolei;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeArco;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeAtletismo;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeBicleta;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeBoxe;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeEscalada;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeEsgrima;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeEsqui;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeGinastica;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeHandebol;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeHoquei;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeModalidadeFutebol;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeModalideCroquet;
import br.com.magna.sistemas.esportes.enums.EnumTipoDeNado;
import br.com.magna.sistemas.esportes.enums.EnumTiposDeSaltoOrnamental;
import br.com.magna.sistemas.esportes.enums.EnumTiposDeSoftbol;
import br.com.magna.sistemas.esportes.invasao.Basquete;
import br.com.magna.sistemas.esportes.invasao.Futebol;
import br.com.magna.sistemas.esportes.invasao.FutebolAmericano;
import br.com.magna.sistemas.esportes.invasao.Handebol;
import br.com.magna.sistemas.esportes.invasao.Hoquei;
import br.com.magna.sistemas.esportes.invasao.PoloAquatico;
import br.com.magna.sistemas.esportes.invasao.Rugby;
import br.com.magna.sistemas.esportes.marca.Atletismo;
import br.com.magna.sistemas.esportes.marca.Ciclismo;
import br.com.magna.sistemas.esportes.marca.Escalada;
import br.com.magna.sistemas.esportes.marca.Esqui;
import br.com.magna.sistemas.esportes.marca.Natacao;
import br.com.magna.sistemas.esportes.precisao.Croquet;
import br.com.magna.sistemas.esportes.precisao.Curling;
import br.com.magna.sistemas.esportes.precisao.Golfe;
import br.com.magna.sistemas.esportes.precisao.TiroArco;
import br.com.magna.sistemas.esportes.rede.Badminton;
import br.com.magna.sistemas.esportes.rede.Futvolei;
import br.com.magna.sistemas.esportes.rede.Tenis;
import br.com.magna.sistemas.esportes.rede.TenisDeMesa;
import br.com.magna.sistemas.esportes.rede.Volei;
import br.com.magna.sistemas.esportes.taco.Beisebol;
import br.com.magna.sistemas.esportes.taco.Criquete;
import br.com.magna.sistemas.esportes.taco.Softbol;
import br.com.magna.sistemas.esportes.tecnico.Ginastica;
import br.com.magna.sistemas.esportes.tecnico.NadoSincronizado;
import br.com.magna.sistemas.esportes.tecnico.PatinacaoArtistica;
import br.com.magna.sistemas.esportes.tecnico.SaltosOrnamentais;
import br.com.magna.sistemas.esportes.tecnico.Surf;

public  class TesteJunit  {

    @Test
    public void testAtletismo() {
        Atletismo atl = new Atletismo();
        Atletismo atl2 = new Atletismo();
        
        atl.setTipoDeAtletismo(EnumTipoDeAtletismo.PROVA_DE_ARREMESSO);
        atl2.setTipoDeAtletismo(EnumTipoDeAtletismo.PROVA_DE_REVESAMENTO);
        
        System.out.println(atl);
        System.out.println(atl.hashCode());
        System.out.println(atl.equals(atl2));
        
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testCiclismo() {
        Ciclismo cic = new Ciclismo();
        Ciclismo cic2 = new Ciclismo();
        
        cic.setTipoBicicleta(EnumTipoDeBicleta.PISTA);
        cic2.setTipoBicicleta(EnumTipoDeBicleta.MONTAN_BIKE);
        
        System.out.println(cic);
        System.out.println(cic.hashCode());
        System.out.println(cic.equals(cic2));
        
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testEscalada() {
    	Escalada esc = new Escalada();
    	Escalada esc2 = new Escalada();
    	
    	esc.setTipoDeEscalada(EnumTipoDeEscalada.ALPINISMO);
    	esc2.setTipoDeEscalada(EnumTipoDeEscalada.ESPORTIVA);
    	
    	System.out.println(esc);
        System.out.println(esc.hashCode());
        System.out.println(esc.equals(esc2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testEsqui() {
    
    	Esqui esq = new Esqui();
    	Esqui esq2 = new Esqui();
    	
    	esq.setTipoDeEsqui(EnumTipoDeEsqui.CROSS_COUNTRY);
    	esq2.setTipoDeEsqui(EnumTipoDeEsqui.ESQUI_ALPINO);
    	
    	System.out.println(esq);
        System.out.println(esq.hashCode());
        System.out.println(esq.equals(esq2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testNatacao() {
    
    	Natacao nat = new Natacao();
    	Natacao nat2 = new Natacao();
    	
    	nat.setTipoDeNado(EnumTipoDeNado.BORBOLETA);
    	nat2.setTipoDeNado(EnumTipoDeNado.PEITO);
    	
    	System.out.println(nat);
        System.out.println(nat.hashCode());
        System.out.println(nat.equals(nat2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testBoxe() {
    
    	Boxe box = new Boxe();
    	Boxe box2 = new Boxe();
    	
    	box.setTipoDeBoxe(EnumTipoDeBoxe.KICKBOXING);
    	box2.setTipoDeBoxe(EnumTipoDeBoxe.BOXE_CHINES);
    	
    	System.out.println(box);
        System.out.println(box.hashCode());
        System.out.println(box.equals(box2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testCarate() {
    
    	Karate car = new Karate();
    	Karate car2 = new Karate();
    	
    	car.setEstiloDeCarate(EnumEstilosDeCarate.WADO_RYU);
    	car2.setEstiloDeCarate(EnumEstilosDeCarate.SHITO_RYU);
    	
    	System.out.println(car);
        System.out.println(car.hashCode());
        System.out.println(car.equals(car2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testEsgrima() {
    
    	Esgrima esg = new Esgrima();
    	Esgrima esg2 = new Esgrima();
    	
    	esg.setTipoDeEsgrima(EnumTipoDeEsgrima.ESPADA);
    	esg2.setTipoDeEsgrima(EnumTipoDeEsgrima.FLORETE);
    	
    	System.out.println(esg);
        System.out.println(esg.hashCode());
        System.out.println(esg.equals(esg2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testJudo() {
    
    	Judo judo = new Judo();
    	Judo judo2 = new Judo();
    	
    	judo.setEstiloDeJudo(EnumEstilosDeJudo.KODOKAN_GOSHIN_JUTSU);
    	judo2.setEstiloDeJudo(EnumEstilosDeJudo.KATAME_NO_KATA);
    	
    	System.out.println(judo);
        System.out.println(judo.hashCode());
        System.out.println(judo.equals(judo2));
    	
        Assert.assertEquals(false, false);
        
    }

    @Test
    public void testMma() {
    
    	Mma mma = new Mma();
    	Mma mma2 = new Mma();
    	
    	mma.setEspecialidadeAtleta(EnumEspecialidadeDoAtletaMma.CARATE);
    	mma2.setEspecialidadeAtleta(EnumEspecialidadeDoAtletaMma.JIU_JITSU);
    	
    	System.out.println(mma);
        System.out.println(mma.hashCode());
        System.out.println(mma.equals(mma2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testMuayThai() {
    
    	MuayThai muay = new MuayThai();
    	MuayThai muay2 = new MuayThai();
    	
    	muay.setEstilosDeMuayThai(EnumEstilosDeMuayThai.MUAY_DARN);
    	muay2.setEstilosDeMuayThai(EnumEstilosDeMuayThai.MUAY_KHAO);
    	
    	System.out.println(muay);
        System.out.println(muay.hashCode());
        System.out.println(muay.equals(muay2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testTaekwondo() {
    
    	Taekwondo tae = new Taekwondo();
    	Taekwondo tae2 = new Taekwondo();
    	
    	tae.setEstilosDeTaekwondo(EnumEstilosDeTaekwondo.ITF);
    	tae2.setEstilosDeTaekwondo(EnumEstilosDeTaekwondo.STF);
    	
    	System.out.println(tae);
        System.out.println(tae.hashCode());
        System.out.println(tae.equals(tae2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testBasquete() {
    
    	Basquete basq = new Basquete();
    	Basquete basq2 = new Basquete();
    	
    	basq.setTipoDeModalidade(EnumModalidadeDeBasquete.CINCO_X_CINCO);
    	basq2.setTipoDeModalidade(EnumModalidadeDeBasquete.TRES_X_TRES);
    	
    	System.out.println(basq);
        System.out.println(basq.hashCode());
        System.out.println(basq.equals(basq2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testFutebol() {
    
    	Futebol fut = new Futebol();
    	Futebol fut2 = new Futebol();
    	
    	fut.setTipoDeModalidadeFutebol(EnumTipoDeModalidadeFutebol.FUTEBOL_AREIA);
    	fut2.setTipoDeModalidadeFutebol(EnumTipoDeModalidadeFutebol.FUTEBOL_CAMPO);
    	
    	System.out.println(fut);
        System.out.println(fut.hashCode());
        System.out.println(fut.equals(fut2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testFutebolAmericano() {
    
    	FutebolAmericano americano = new FutebolAmericano();
    	FutebolAmericano americano2 = new FutebolAmericano();
    	
    	americano.setConferenciaDeFutebolAmericano(EnumConferenciasDeFutebolAmericano.AFC);
    	americano2.setConferenciaDeFutebolAmericano(EnumConferenciasDeFutebolAmericano.NFC);
    	
    	System.out.println(americano);
        System.out.println(americano.hashCode());
        System.out.println(americano.equals(americano2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testHandebol() {
    
    	Handebol hand = new Handebol();
    	Handebol hand2 = new Handebol();
    	
    	hand.setTipoDeHandebol(EnumTipoDeHandebol.PRAIA);
    	hand2.setTipoDeHandebol(EnumTipoDeHandebol.QUADRA);
    	
    	System.out.println(hand);
        System.out.println(hand.hashCode());
        System.out.println(hand.equals(hand2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testHoquei() {
    
    	Hoquei hoq = new Hoquei();
    	Hoquei hoq2 = new Hoquei();
    	
    	hoq.setTipoDeHoquei(EnumTipoDeHoquei.GELO);
    	hoq2.setTipoDeHoquei(EnumTipoDeHoquei.GRAMA);
    	
    	System.out.println(hoq);
        System.out.println(hoq.hashCode());
        System.out.println(hoq.equals(hoq2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testPoloAquatico() {
    
    	PoloAquatico polo = new PoloAquatico();
    	PoloAquatico polo2 = new PoloAquatico();
    	
    	polo.setFederacoesDePoloAquatico(EnumFederacoesDePoloAquatico.CBDA);
    	polo2.setFederacoesDePoloAquatico(EnumFederacoesDePoloAquatico.FINA);
    	
    	System.out.println(polo);
        System.out.println(polo.hashCode());
        System.out.println(polo.equals(polo2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testRugby() {
    
    	Rugby rug = new Rugby();
    	Rugby rug2 = new Rugby();
    	
    	rug.setModalidadeRugby(EnumModalidadeDeRugby.LEAGUE);
    	rug2.setModalidadeRugby(EnumModalidadeDeRugby.UNION);
    	
    	System.out.println(rug);
        System.out.println(rug.hashCode());
        System.out.println(rug.equals(rug2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testCroquet() {
    
    	Croquet croq = new Croquet();
    	Croquet croq2 = new Croquet();
    	
    	croq.setTipoDeModalideCroquet(EnumTipoDeModalideCroquet.ASSOCIATION_CROQUET);
    	croq2.setTipoDeModalideCroquet(EnumTipoDeModalideCroquet.GOLF_CROQUET);
    	
    	System.out.println(croq);
        System.out.println(croq.hashCode());
        System.out.println(croq.equals(croq2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testCurling() {
    
    	Curling cur = new Curling();
    	Curling cur2 = new Curling();
    	
    	cur.setCategoriaCurling(EnumCategoriaCurling.EQUIPE_MISTA);
    	cur2.setCategoriaCurling(EnumCategoriaCurling.TRADICIONAL);
    	
    	System.out.println(cur);
        System.out.println(cur.hashCode());
        System.out.println(cur.equals(cur2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testGolfe() {
    
    	Golfe golf = new Golfe();
    	Golfe golf2 = new Golfe();
    	
    	golf.setModalidadeGolfe(EnumModalidadeDeGolfe.MATCH_PLAY);
    	golf2.setModalidadeGolfe(EnumModalidadeDeGolfe.STROKE_PLAY);
    	
    	System.out.println(golf);
        System.out.println(golf.hashCode());
        System.out.println(golf.equals(golf2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testTiroArco() {
    
    
    	TiroArco tiro = new TiroArco();
    	TiroArco tiro2 = new TiroArco();
    	
    	tiro.setTipoDeArco(EnumTipoDeArco.LONGBOW);
    	tiro2.setTipoDeArco(EnumTipoDeArco.RECURVO);
    	
    	System.out.println(tiro);
        System.out.println(tiro.hashCode());
        System.out.println(tiro.equals(tiro2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testBadminton() {
    
    	Badminton bad = new Badminton();
    	Badminton bad2 = new Badminton();
    	
    	bad.setModalidadeBadminton(EnumModalidadeDeBadminton.DUPLAS);
    	bad2.setModalidadeBadminton(EnumModalidadeDeBadminton.SIMPLES);
    	
    	System.out.println(bad);
        System.out.println(bad.hashCode());
        System.out.println(bad.equals(bad2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testFutvolei() {
    
    	Futvolei futv = new Futvolei();
    	Futvolei futv2 = new Futvolei();
    	
    	futv.setModalidadeFutvolei(EnumModalidadeDeFutvolei.QUATRO_X_QUATRO);
    	futv2.setModalidadeFutvolei(EnumModalidadeDeFutvolei.TRES_X_TRES);
    	
    	System.out.println(futv);
        System.out.println(futv.hashCode());
        System.out.println(futv.equals(futv2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testTenis() {
    
    	Tenis ten = new Tenis();
    	Tenis ten2 = new Tenis();
    	
    	ten.setModalidadeTenis(EnumModalidadeDeTenis.QUADRA_DE_GRAMA);
    	ten2.setModalidadeTenis(EnumModalidadeDeTenis.QUADRA_RAPIDA);
    	
    	System.out.println(ten);
        System.out.println(ten.hashCode());
        System.out.println(ten.equals(ten2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testTenisDeMesa() {
    
    	TenisDeMesa tmesa = new TenisDeMesa();
    	TenisDeMesa tmesa2 = new TenisDeMesa();
    	
    	tmesa.setModalidadeTenisDeMesa(EnumModalidadeDeTenisDeMesa.EQUIPES);
    	tmesa2.setModalidadeTenisDeMesa(EnumModalidadeDeTenisDeMesa.INDIVIDUAL);
    	
    	System.out.println(tmesa);
        System.out.println(tmesa.hashCode());
        System.out.println(tmesa.equals(tmesa2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testVolei() {
    
    	Volei vol = new Volei();
    	Volei vol2 = new Volei();
    	
    	vol.setModalidadeVolei(EnumModalidadeDeVolei.PRAIA);
    	vol2.setModalidadeVolei(EnumModalidadeDeVolei.QUADRA);
    	
    	System.out.println(vol);
        System.out.println(vol.hashCode());
        System.out.println(vol.equals(vol2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testBeisebol() {
    
    	Beisebol bei = new Beisebol();
    	Beisebol bei2 = new Beisebol();
    	
    	bei.setConferenciaDeBeisebol(EnumConferenciaDeBeisebol.AMERICAN_LEAGUE);
    	bei2.setConferenciaDeBeisebol(EnumConferenciaDeBeisebol.NATIONAL_LEAGUE);
    	
    	System.out.println(bei);
        System.out.println(bei.hashCode());
        System.out.println(bei.equals(bei2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testCriquete() {
    
    	Criquete criq = new Criquete();
    	Criquete criq2 = new Criquete();
    	
    	criq.setModalidadeDoCriquete(EnumModalidadeDeCriquete.ONE_DAY);
    	criq2.setModalidadeDoCriquete(EnumModalidadeDeCriquete.TEST_CRICKET);
    	
    	System.out.println(criq);
        System.out.println(criq.hashCode());
        System.out.println(criq.equals(criq2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testSoftbol() {
    
    	Softbol sof = new Softbol();
    	Softbol sof2 = new Softbol();
    	
    	sof.setTiposDeSoftbol(EnumTiposDeSoftbol.FAST_PITCH);
    	sof2.setTiposDeSoftbol(EnumTiposDeSoftbol.SLOW_PITCH);
    	
    	System.out.println(sof);
        System.out.println(sof.hashCode());
        System.out.println(sof.equals(sof2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testGinastica() {
    
    	Ginastica gin = new Ginastica();
    	Ginastica gin2 = new Ginastica();
    	
    	gin.setTipoDeGinastica(EnumTipoDeGinastica.GINASTICA_ACROBATICA);
    	gin2.setTipoDeGinastica(EnumTipoDeGinastica.GINASTICA_RITIMICA);
    	
    	System.out.println(gin);
        System.out.println(gin.hashCode());
        System.out.println(gin.equals(gin2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testNadoSincronizado() {
    
    	NadoSincronizado sincronizado = new NadoSincronizado();
    	NadoSincronizado sincronizado2 = new NadoSincronizado();
    	
    	sincronizado.setModalidadeNadoSincronizado(EnumModalidadeDeNadoSincronizado.CONJUNTO);
    	sincronizado2.setModalidadeNadoSincronizado(EnumModalidadeDeNadoSincronizado.SOLO);
    	
    	System.out.println(sincronizado);
        System.out.println(sincronizado.hashCode());
        System.out.println(sincronizado.equals(sincronizado2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testPatinacaoArtistica() {
    
    	PatinacaoArtistica pat = new PatinacaoArtistica();
    	PatinacaoArtistica pat2 = new PatinacaoArtistica();
    	
    	pat.setModalidadePatinacaoArtistica(EnumModalidadeDePatinacaoArtistica.DANCA_NO_GELO);
    	pat2.setModalidadePatinacaoArtistica(EnumModalidadeDePatinacaoArtistica.DUPLAS);
    	
    	System.out.println(pat);
        System.out.println(pat.hashCode());
        System.out.println(pat.equals(pat2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testSaltosOrnamentais() {
    
    	SaltosOrnamentais salto = new SaltosOrnamentais();
    	SaltosOrnamentais salto2 = new SaltosOrnamentais();
    	
    	salto.setTiposDeSaltoOrnamental(EnumTiposDeSaltoOrnamental.PARAFUSO);
    	salto2.setTiposDeSaltoOrnamental(EnumTiposDeSaltoOrnamental.REVIRADO);
    	
    	System.out.println(salto);
        System.out.println(salto.hashCode());
        System.out.println(salto.equals(salto2));
    	
    	
        Assert.assertEquals(false, false);
        
    }
    
    @Test
    public void testSurf() {
    
    	Surf surf = new Surf();
    	Surf surf2 = new Surf();
    	
    	surf.setModalidadesDeSurf(EnumModalidadeDeSurf.LONGBOARD);
    	surf2.setModalidadesDeSurf(EnumModalidadeDeSurf.BODYSURF);
    	
    	System.out.println(surf);
        System.out.println(surf.hashCode());
        System.out.println(surf.equals(surf2));
    	
        Assert.assertEquals(false, false);
        
    }
    
    
    
}
