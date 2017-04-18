package org.eclipse.papyrus.requirements.sysml14.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.papyrus.requirements.sysml14.services.BoilerplateTextGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/*****************************************************************************
 * Copyright (c) 2017 CEA LIST.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 * 		Mauricio Alferez (mauricio.alferez@cea.fr) CEA LIST - Initial API and implementation
 *
 *****************************************************************************/
@SuppressWarnings("all")
public class InternalBoilerplateTextParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'if'", "'and'", "'while'", "'shall'", "'not'", "'allow'", "'to'", "'be'", "'able'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalBoilerplateTextParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoilerplateTextParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoilerplateTextParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoilerplateText.g"; }


    	private BoilerplateTextGrammarAccess grammarAccess;

    	public void setGrammarAccess(BoilerplateTextGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalBoilerplateText.g:68:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:69:1: ( ruleModel EOF )
            // InternalBoilerplateText.g:70:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBoilerplateText.g:77:1: ruleModel : ( ( rule__Model__ModelAssignment ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:81:2: ( ( ( rule__Model__ModelAssignment ) ) )
            // InternalBoilerplateText.g:82:2: ( ( rule__Model__ModelAssignment ) )
            {
            // InternalBoilerplateText.g:82:2: ( ( rule__Model__ModelAssignment ) )
            // InternalBoilerplateText.g:83:3: ( rule__Model__ModelAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAssignment()); 
            }
            // InternalBoilerplateText.g:84:3: ( rule__Model__ModelAssignment )
            // InternalBoilerplateText.g:84:4: rule__Model__ModelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Model__ModelAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRequirement"
    // InternalBoilerplateText.g:93:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:94:1: ( ruleRequirement EOF )
            // InternalBoilerplateText.g:95:1: ruleRequirement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRequirement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalBoilerplateText.g:102:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:106:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // InternalBoilerplateText.g:107:2: ( ( rule__Requirement__Group__0 ) )
            {
            // InternalBoilerplateText.g:107:2: ( ( rule__Requirement__Group__0 ) )
            // InternalBoilerplateText.g:108:3: ( rule__Requirement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:109:3: ( rule__Requirement__Group__0 )
            // InternalBoilerplateText.g:109:4: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleSubject"
    // InternalBoilerplateText.g:118:1: entryRuleSubject : ruleSubject EOF ;
    public final void entryRuleSubject() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:119:1: ( ruleSubject EOF )
            // InternalBoilerplateText.g:120:1: ruleSubject EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalBoilerplateText.g:127:1: ruleSubject : ( ( rule__Subject__SystemAssignment ) ) ;
    public final void ruleSubject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:131:2: ( ( ( rule__Subject__SystemAssignment ) ) )
            // InternalBoilerplateText.g:132:2: ( ( rule__Subject__SystemAssignment ) )
            {
            // InternalBoilerplateText.g:132:2: ( ( rule__Subject__SystemAssignment ) )
            // InternalBoilerplateText.g:133:3: ( rule__Subject__SystemAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectAccess().getSystemAssignment()); 
            }
            // InternalBoilerplateText.g:134:3: ( rule__Subject__SystemAssignment )
            // InternalBoilerplateText.g:134:4: rule__Subject__SystemAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Subject__SystemAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectAccess().getSystemAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePrefix"
    // InternalBoilerplateText.g:143:1: entryRulePrefix : rulePrefix EOF ;
    public final void entryRulePrefix() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:144:1: ( rulePrefix EOF )
            // InternalBoilerplateText.g:145:1: rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalBoilerplateText.g:152:1: rulePrefix : ( ( rule__Prefix__Alternatives ) ) ;
    public final void rulePrefix() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:156:2: ( ( ( rule__Prefix__Alternatives ) ) )
            // InternalBoilerplateText.g:157:2: ( ( rule__Prefix__Alternatives ) )
            {
            // InternalBoilerplateText.g:157:2: ( ( rule__Prefix__Alternatives ) )
            // InternalBoilerplateText.g:158:3: ( rule__Prefix__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrefixAccess().getAlternatives()); 
            }
            // InternalBoilerplateText.g:159:3: ( rule__Prefix__Alternatives )
            // InternalBoilerplateText.g:159:4: rule__Prefix__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Prefix__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrefixAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleIf"
    // InternalBoilerplateText.g:168:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:169:1: ( ruleIf EOF )
            // InternalBoilerplateText.g:170:1: ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalBoilerplateText.g:177:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:181:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalBoilerplateText.g:182:2: ( ( rule__If__Group__0 ) )
            {
            // InternalBoilerplateText.g:182:2: ( ( rule__If__Group__0 ) )
            // InternalBoilerplateText.g:183:3: ( rule__If__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:184:3: ( rule__If__Group__0 )
            // InternalBoilerplateText.g:184:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalBoilerplateText.g:193:1: entryRuleWhile : ruleWhile EOF ;
    public final void entryRuleWhile() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:194:1: ( ruleWhile EOF )
            // InternalBoilerplateText.g:195:1: ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWhile();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBoilerplateText.g:202:1: ruleWhile : ( ( rule__While__Group__0 ) ) ;
    public final void ruleWhile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:206:2: ( ( ( rule__While__Group__0 ) ) )
            // InternalBoilerplateText.g:207:2: ( ( rule__While__Group__0 ) )
            {
            // InternalBoilerplateText.g:207:2: ( ( rule__While__Group__0 ) )
            // InternalBoilerplateText.g:208:3: ( rule__While__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:209:3: ( rule__While__Group__0 )
            // InternalBoilerplateText.g:209:4: rule__While__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRulePredicate"
    // InternalBoilerplateText.g:218:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:219:1: ( rulePredicate EOF )
            // InternalBoilerplateText.g:220:1: rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalBoilerplateText.g:227:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:231:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // InternalBoilerplateText.g:232:2: ( ( rule__Predicate__Alternatives ) )
            {
            // InternalBoilerplateText.g:232:2: ( ( rule__Predicate__Alternatives ) )
            // InternalBoilerplateText.g:233:3: ( rule__Predicate__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getAlternatives()); 
            }
            // InternalBoilerplateText.g:234:3: ( rule__Predicate__Alternatives )
            // InternalBoilerplateText.g:234:4: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleShallNotAllow"
    // InternalBoilerplateText.g:243:1: entryRuleShallNotAllow : ruleShallNotAllow EOF ;
    public final void entryRuleShallNotAllow() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:244:1: ( ruleShallNotAllow EOF )
            // InternalBoilerplateText.g:245:1: ruleShallNotAllow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShallNotAllow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShallNotAllow"


    // $ANTLR start "ruleShallNotAllow"
    // InternalBoilerplateText.g:252:1: ruleShallNotAllow : ( ( rule__ShallNotAllow__Group__0 ) ) ;
    public final void ruleShallNotAllow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:256:2: ( ( ( rule__ShallNotAllow__Group__0 ) ) )
            // InternalBoilerplateText.g:257:2: ( ( rule__ShallNotAllow__Group__0 ) )
            {
            // InternalBoilerplateText.g:257:2: ( ( rule__ShallNotAllow__Group__0 ) )
            // InternalBoilerplateText.g:258:3: ( rule__ShallNotAllow__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:259:3: ( rule__ShallNotAllow__Group__0 )
            // InternalBoilerplateText.g:259:4: rule__ShallNotAllow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShallNotAllow"


    // $ANTLR start "entryRuleShallAllow"
    // InternalBoilerplateText.g:268:1: entryRuleShallAllow : ruleShallAllow EOF ;
    public final void entryRuleShallAllow() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:269:1: ( ruleShallAllow EOF )
            // InternalBoilerplateText.g:270:1: ruleShallAllow EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShallAllow();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShallAllow"


    // $ANTLR start "ruleShallAllow"
    // InternalBoilerplateText.g:277:1: ruleShallAllow : ( ( rule__ShallAllow__Group__0 ) ) ;
    public final void ruleShallAllow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:281:2: ( ( ( rule__ShallAllow__Group__0 ) ) )
            // InternalBoilerplateText.g:282:2: ( ( rule__ShallAllow__Group__0 ) )
            {
            // InternalBoilerplateText.g:282:2: ( ( rule__ShallAllow__Group__0 ) )
            // InternalBoilerplateText.g:283:3: ( rule__ShallAllow__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:284:3: ( rule__ShallAllow__Group__0 )
            // InternalBoilerplateText.g:284:4: rule__ShallAllow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShallAllow"


    // $ANTLR start "entryRuleShallNot"
    // InternalBoilerplateText.g:293:1: entryRuleShallNot : ruleShallNot EOF ;
    public final void entryRuleShallNot() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:294:1: ( ruleShallNot EOF )
            // InternalBoilerplateText.g:295:1: ruleShallNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShallNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShallNot"


    // $ANTLR start "ruleShallNot"
    // InternalBoilerplateText.g:302:1: ruleShallNot : ( ( rule__ShallNot__Group__0 ) ) ;
    public final void ruleShallNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:306:2: ( ( ( rule__ShallNot__Group__0 ) ) )
            // InternalBoilerplateText.g:307:2: ( ( rule__ShallNot__Group__0 ) )
            {
            // InternalBoilerplateText.g:307:2: ( ( rule__ShallNot__Group__0 ) )
            // InternalBoilerplateText.g:308:3: ( rule__ShallNot__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:309:3: ( rule__ShallNot__Group__0 )
            // InternalBoilerplateText.g:309:4: rule__ShallNot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShallNot"


    // $ANTLR start "entryRuleShall"
    // InternalBoilerplateText.g:318:1: entryRuleShall : ruleShall EOF ;
    public final void entryRuleShall() throws RecognitionException {
        try {
            // InternalBoilerplateText.g:319:1: ( ruleShall EOF )
            // InternalBoilerplateText.g:320:1: ruleShall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleShall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleShall"


    // $ANTLR start "ruleShall"
    // InternalBoilerplateText.g:327:1: ruleShall : ( ( rule__Shall__Group__0 ) ) ;
    public final void ruleShall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:331:2: ( ( ( rule__Shall__Group__0 ) ) )
            // InternalBoilerplateText.g:332:2: ( ( rule__Shall__Group__0 ) )
            {
            // InternalBoilerplateText.g:332:2: ( ( rule__Shall__Group__0 ) )
            // InternalBoilerplateText.g:333:3: ( rule__Shall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getGroup()); 
            }
            // InternalBoilerplateText.g:334:3: ( rule__Shall__Group__0 )
            // InternalBoilerplateText.g:334:4: rule__Shall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Shall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleShall"


    // $ANTLR start "rule__Prefix__Alternatives"
    // InternalBoilerplateText.g:342:1: rule__Prefix__Alternatives : ( ( ruleIf ) | ( ruleWhile ) );
    public final void rule__Prefix__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:346:1: ( ( ruleIf ) | ( ruleWhile ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBoilerplateText.g:347:2: ( ruleIf )
                    {
                    // InternalBoilerplateText.g:347:2: ( ruleIf )
                    // InternalBoilerplateText.g:348:3: ruleIf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixAccess().getIfParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixAccess().getIfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:353:2: ( ruleWhile )
                    {
                    // InternalBoilerplateText.g:353:2: ( ruleWhile )
                    // InternalBoilerplateText.g:354:3: ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrefixAccess().getWhileParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleWhile();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrefixAccess().getWhileParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Prefix__Alternatives"


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalBoilerplateText.g:363:1: rule__Predicate__Alternatives : ( ( ruleShall ) | ( ruleShallNot ) | ( ruleShallAllow ) | ( ruleShallNotAllow ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:367:1: ( ( ruleShall ) | ( ruleShallNot ) | ( ruleShallAllow ) | ( ruleShallNotAllow ) )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==RULE_STRING||LA2_2==19) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==17) ) {
                        alt2=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 17:
                    {
                    alt2=3;
                    }
                    break;
                case RULE_STRING:
                case 19:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoilerplateText.g:368:2: ( ruleShall )
                    {
                    // InternalBoilerplateText.g:368:2: ( ruleShall )
                    // InternalBoilerplateText.g:369:3: ruleShall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateAccess().getShallParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateAccess().getShallParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:374:2: ( ruleShallNot )
                    {
                    // InternalBoilerplateText.g:374:2: ( ruleShallNot )
                    // InternalBoilerplateText.g:375:3: ruleShallNot
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateAccess().getShallNotParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShallNot();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateAccess().getShallNotParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalBoilerplateText.g:380:2: ( ruleShallAllow )
                    {
                    // InternalBoilerplateText.g:380:2: ( ruleShallAllow )
                    // InternalBoilerplateText.g:381:3: ruleShallAllow
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateAccess().getShallAllowParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShallAllow();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateAccess().getShallAllowParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalBoilerplateText.g:386:2: ( ruleShallNotAllow )
                    {
                    // InternalBoilerplateText.g:386:2: ( ruleShallNotAllow )
                    // InternalBoilerplateText.g:387:3: ruleShallNotAllow
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredicateAccess().getShallNotAllowParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleShallNotAllow();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredicateAccess().getShallNotAllowParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__ShallNotAllow__Alternatives_3"
    // InternalBoilerplateText.g:396:1: rule__ShallNotAllow__Alternatives_3 : ( ( ( rule__ShallNotAllow__ActionAssignment_3_0 ) ) | ( ( rule__ShallNotAllow__Group_3_1__0 ) ) );
    public final void rule__ShallNotAllow__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:400:1: ( ( ( rule__ShallNotAllow__ActionAssignment_3_0 ) ) | ( ( rule__ShallNotAllow__Group_3_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==18) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF) ) {
                    alt3=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoilerplateText.g:401:2: ( ( rule__ShallNotAllow__ActionAssignment_3_0 ) )
                    {
                    // InternalBoilerplateText.g:401:2: ( ( rule__ShallNotAllow__ActionAssignment_3_0 ) )
                    // InternalBoilerplateText.g:402:3: ( rule__ShallNotAllow__ActionAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShallNotAllowAccess().getActionAssignment_3_0()); 
                    }
                    // InternalBoilerplateText.g:403:3: ( rule__ShallNotAllow__ActionAssignment_3_0 )
                    // InternalBoilerplateText.g:403:4: rule__ShallNotAllow__ActionAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShallNotAllow__ActionAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShallNotAllowAccess().getActionAssignment_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:407:2: ( ( rule__ShallNotAllow__Group_3_1__0 ) )
                    {
                    // InternalBoilerplateText.g:407:2: ( ( rule__ShallNotAllow__Group_3_1__0 ) )
                    // InternalBoilerplateText.g:408:3: ( rule__ShallNotAllow__Group_3_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShallNotAllowAccess().getGroup_3_1()); 
                    }
                    // InternalBoilerplateText.g:409:3: ( rule__ShallNotAllow__Group_3_1__0 )
                    // InternalBoilerplateText.g:409:4: rule__ShallNotAllow__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShallNotAllow__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShallNotAllowAccess().getGroup_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Alternatives_3"


    // $ANTLR start "rule__ShallAllow__Alternatives_2"
    // InternalBoilerplateText.g:417:1: rule__ShallAllow__Alternatives_2 : ( ( ( rule__ShallAllow__ActionAssignment_2_0 ) ) | ( ( rule__ShallAllow__Group_2_1__0 ) ) );
    public final void rule__ShallAllow__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:421:1: ( ( ( rule__ShallAllow__ActionAssignment_2_0 ) ) | ( ( rule__ShallAllow__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF) ) {
                    alt4=1;
                }
                else if ( (LA4_1==18) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBoilerplateText.g:422:2: ( ( rule__ShallAllow__ActionAssignment_2_0 ) )
                    {
                    // InternalBoilerplateText.g:422:2: ( ( rule__ShallAllow__ActionAssignment_2_0 ) )
                    // InternalBoilerplateText.g:423:3: ( rule__ShallAllow__ActionAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShallAllowAccess().getActionAssignment_2_0()); 
                    }
                    // InternalBoilerplateText.g:424:3: ( rule__ShallAllow__ActionAssignment_2_0 )
                    // InternalBoilerplateText.g:424:4: rule__ShallAllow__ActionAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShallAllow__ActionAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShallAllowAccess().getActionAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:428:2: ( ( rule__ShallAllow__Group_2_1__0 ) )
                    {
                    // InternalBoilerplateText.g:428:2: ( ( rule__ShallAllow__Group_2_1__0 ) )
                    // InternalBoilerplateText.g:429:3: ( rule__ShallAllow__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getShallAllowAccess().getGroup_2_1()); 
                    }
                    // InternalBoilerplateText.g:430:3: ( rule__ShallAllow__Group_2_1__0 )
                    // InternalBoilerplateText.g:430:4: rule__ShallAllow__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShallAllow__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getShallAllowAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Alternatives_2"


    // $ANTLR start "rule__Requirement__Group__0"
    // InternalBoilerplateText.g:438:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:442:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // InternalBoilerplateText.g:443:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Requirement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0"


    // $ANTLR start "rule__Requirement__Group__0__Impl"
    // InternalBoilerplateText.g:450:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__Group_0__0 )? ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:454:1: ( ( ( rule__Requirement__Group_0__0 )? ) )
            // InternalBoilerplateText.g:455:1: ( ( rule__Requirement__Group_0__0 )? )
            {
            // InternalBoilerplateText.g:455:1: ( ( rule__Requirement__Group_0__0 )? )
            // InternalBoilerplateText.g:456:2: ( rule__Requirement__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getGroup_0()); 
            }
            // InternalBoilerplateText.g:457:2: ( rule__Requirement__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12||LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoilerplateText.g:457:3: rule__Requirement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Requirement__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__0__Impl"


    // $ANTLR start "rule__Requirement__Group__1"
    // InternalBoilerplateText.g:465:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:469:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // InternalBoilerplateText.g:470:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Requirement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1"


    // $ANTLR start "rule__Requirement__Group__1__Impl"
    // InternalBoilerplateText.g:477:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__SystemAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:481:1: ( ( ( rule__Requirement__SystemAssignment_1 ) ) )
            // InternalBoilerplateText.g:482:1: ( ( rule__Requirement__SystemAssignment_1 ) )
            {
            // InternalBoilerplateText.g:482:1: ( ( rule__Requirement__SystemAssignment_1 ) )
            // InternalBoilerplateText.g:483:2: ( rule__Requirement__SystemAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getSystemAssignment_1()); 
            }
            // InternalBoilerplateText.g:484:2: ( rule__Requirement__SystemAssignment_1 )
            // InternalBoilerplateText.g:484:3: rule__Requirement__SystemAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__SystemAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getSystemAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__1__Impl"


    // $ANTLR start "rule__Requirement__Group__2"
    // InternalBoilerplateText.g:492:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:496:1: ( rule__Requirement__Group__2__Impl )
            // InternalBoilerplateText.g:497:2: rule__Requirement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2"


    // $ANTLR start "rule__Requirement__Group__2__Impl"
    // InternalBoilerplateText.g:503:1: rule__Requirement__Group__2__Impl : ( ( rule__Requirement__PredicateAssignment_2 ) ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:507:1: ( ( ( rule__Requirement__PredicateAssignment_2 ) ) )
            // InternalBoilerplateText.g:508:1: ( ( rule__Requirement__PredicateAssignment_2 ) )
            {
            // InternalBoilerplateText.g:508:1: ( ( rule__Requirement__PredicateAssignment_2 ) )
            // InternalBoilerplateText.g:509:2: ( rule__Requirement__PredicateAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getPredicateAssignment_2()); 
            }
            // InternalBoilerplateText.g:510:2: ( rule__Requirement__PredicateAssignment_2 )
            // InternalBoilerplateText.g:510:3: rule__Requirement__PredicateAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__PredicateAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getPredicateAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group__2__Impl"


    // $ANTLR start "rule__Requirement__Group_0__0"
    // InternalBoilerplateText.g:519:1: rule__Requirement__Group_0__0 : rule__Requirement__Group_0__0__Impl rule__Requirement__Group_0__1 ;
    public final void rule__Requirement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:523:1: ( rule__Requirement__Group_0__0__Impl rule__Requirement__Group_0__1 )
            // InternalBoilerplateText.g:524:2: rule__Requirement__Group_0__0__Impl rule__Requirement__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Requirement__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Requirement__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_0__0"


    // $ANTLR start "rule__Requirement__Group_0__0__Impl"
    // InternalBoilerplateText.g:531:1: rule__Requirement__Group_0__0__Impl : ( ( rule__Requirement__PrefixAssignment_0_0 ) ) ;
    public final void rule__Requirement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:535:1: ( ( ( rule__Requirement__PrefixAssignment_0_0 ) ) )
            // InternalBoilerplateText.g:536:1: ( ( rule__Requirement__PrefixAssignment_0_0 ) )
            {
            // InternalBoilerplateText.g:536:1: ( ( rule__Requirement__PrefixAssignment_0_0 ) )
            // InternalBoilerplateText.g:537:2: ( rule__Requirement__PrefixAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getPrefixAssignment_0_0()); 
            }
            // InternalBoilerplateText.g:538:2: ( rule__Requirement__PrefixAssignment_0_0 )
            // InternalBoilerplateText.g:538:3: rule__Requirement__PrefixAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__PrefixAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getPrefixAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_0__0__Impl"


    // $ANTLR start "rule__Requirement__Group_0__1"
    // InternalBoilerplateText.g:546:1: rule__Requirement__Group_0__1 : rule__Requirement__Group_0__1__Impl ;
    public final void rule__Requirement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:550:1: ( rule__Requirement__Group_0__1__Impl )
            // InternalBoilerplateText.g:551:2: rule__Requirement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Requirement__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_0__1"


    // $ANTLR start "rule__Requirement__Group_0__1__Impl"
    // InternalBoilerplateText.g:557:1: rule__Requirement__Group_0__1__Impl : ( ',' ) ;
    public final void rule__Requirement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:561:1: ( ( ',' ) )
            // InternalBoilerplateText.g:562:1: ( ',' )
            {
            // InternalBoilerplateText.g:562:1: ( ',' )
            // InternalBoilerplateText.g:563:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getCommaKeyword_0_1()); 
            }
            match(input,11,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getCommaKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__Group_0__1__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalBoilerplateText.g:573:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:577:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalBoilerplateText.g:578:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__If__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalBoilerplateText.g:585:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:589:1: ( ( 'if' ) )
            // InternalBoilerplateText.g:590:1: ( 'if' )
            {
            // InternalBoilerplateText.g:590:1: ( 'if' )
            // InternalBoilerplateText.g:591:2: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }
            match(input,12,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getIfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalBoilerplateText.g:600:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:604:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalBoilerplateText.g:605:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__If__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalBoilerplateText.g:612:1: rule__If__Group__1__Impl : ( ( rule__If__EventAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:616:1: ( ( ( rule__If__EventAssignment_1 ) ) )
            // InternalBoilerplateText.g:617:1: ( ( rule__If__EventAssignment_1 ) )
            {
            // InternalBoilerplateText.g:617:1: ( ( rule__If__EventAssignment_1 ) )
            // InternalBoilerplateText.g:618:2: ( rule__If__EventAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getEventAssignment_1()); 
            }
            // InternalBoilerplateText.g:619:2: ( rule__If__EventAssignment_1 )
            // InternalBoilerplateText.g:619:3: rule__If__EventAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__If__EventAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getEventAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalBoilerplateText.g:627:1: rule__If__Group__2 : rule__If__Group__2__Impl ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:631:1: ( rule__If__Group__2__Impl )
            // InternalBoilerplateText.g:632:2: rule__If__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalBoilerplateText.g:638:1: rule__If__Group__2__Impl : ( ( rule__If__Group_2__0 )* ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:642:1: ( ( ( rule__If__Group_2__0 )* ) )
            // InternalBoilerplateText.g:643:1: ( ( rule__If__Group_2__0 )* )
            {
            // InternalBoilerplateText.g:643:1: ( ( rule__If__Group_2__0 )* )
            // InternalBoilerplateText.g:644:2: ( rule__If__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getGroup_2()); 
            }
            // InternalBoilerplateText.g:645:2: ( rule__If__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalBoilerplateText.g:645:3: rule__If__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__If__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group_2__0"
    // InternalBoilerplateText.g:654:1: rule__If__Group_2__0 : rule__If__Group_2__0__Impl rule__If__Group_2__1 ;
    public final void rule__If__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:658:1: ( rule__If__Group_2__0__Impl rule__If__Group_2__1 )
            // InternalBoilerplateText.g:659:2: rule__If__Group_2__0__Impl rule__If__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__If__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__If__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__0"


    // $ANTLR start "rule__If__Group_2__0__Impl"
    // InternalBoilerplateText.g:666:1: rule__If__Group_2__0__Impl : ( 'and' ) ;
    public final void rule__If__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:670:1: ( ( 'and' ) )
            // InternalBoilerplateText.g:671:1: ( 'and' )
            {
            // InternalBoilerplateText.g:671:1: ( 'and' )
            // InternalBoilerplateText.g:672:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getAndKeyword_2_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getAndKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__0__Impl"


    // $ANTLR start "rule__If__Group_2__1"
    // InternalBoilerplateText.g:681:1: rule__If__Group_2__1 : rule__If__Group_2__1__Impl ;
    public final void rule__If__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:685:1: ( rule__If__Group_2__1__Impl )
            // InternalBoilerplateText.g:686:2: rule__If__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__1"


    // $ANTLR start "rule__If__Group_2__1__Impl"
    // InternalBoilerplateText.g:692:1: rule__If__Group_2__1__Impl : ( ( rule__If__EventAssignment_2_1 ) ) ;
    public final void rule__If__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:696:1: ( ( ( rule__If__EventAssignment_2_1 ) ) )
            // InternalBoilerplateText.g:697:1: ( ( rule__If__EventAssignment_2_1 ) )
            {
            // InternalBoilerplateText.g:697:1: ( ( rule__If__EventAssignment_2_1 ) )
            // InternalBoilerplateText.g:698:2: ( rule__If__EventAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getEventAssignment_2_1()); 
            }
            // InternalBoilerplateText.g:699:2: ( rule__If__EventAssignment_2_1 )
            // InternalBoilerplateText.g:699:3: rule__If__EventAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__If__EventAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getEventAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_2__1__Impl"


    // $ANTLR start "rule__While__Group__0"
    // InternalBoilerplateText.g:708:1: rule__While__Group__0 : rule__While__Group__0__Impl rule__While__Group__1 ;
    public final void rule__While__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:712:1: ( rule__While__Group__0__Impl rule__While__Group__1 )
            // InternalBoilerplateText.g:713:2: rule__While__Group__0__Impl rule__While__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__While__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__While__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0"


    // $ANTLR start "rule__While__Group__0__Impl"
    // InternalBoilerplateText.g:720:1: rule__While__Group__0__Impl : ( 'while' ) ;
    public final void rule__While__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:724:1: ( ( 'while' ) )
            // InternalBoilerplateText.g:725:1: ( 'while' )
            {
            // InternalBoilerplateText.g:725:1: ( 'while' )
            // InternalBoilerplateText.g:726:2: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getWhileKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__0__Impl"


    // $ANTLR start "rule__While__Group__1"
    // InternalBoilerplateText.g:735:1: rule__While__Group__1 : rule__While__Group__1__Impl ;
    public final void rule__While__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:739:1: ( rule__While__Group__1__Impl )
            // InternalBoilerplateText.g:740:2: rule__While__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__While__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1"


    // $ANTLR start "rule__While__Group__1__Impl"
    // InternalBoilerplateText.g:746:1: rule__While__Group__1__Impl : ( ( rule__While__StateAssignment_1 ) ) ;
    public final void rule__While__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:750:1: ( ( ( rule__While__StateAssignment_1 ) ) )
            // InternalBoilerplateText.g:751:1: ( ( rule__While__StateAssignment_1 ) )
            {
            // InternalBoilerplateText.g:751:1: ( ( rule__While__StateAssignment_1 ) )
            // InternalBoilerplateText.g:752:2: ( rule__While__StateAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStateAssignment_1()); 
            }
            // InternalBoilerplateText.g:753:2: ( rule__While__StateAssignment_1 )
            // InternalBoilerplateText.g:753:3: rule__While__StateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__While__StateAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStateAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__Group__1__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group__0"
    // InternalBoilerplateText.g:762:1: rule__ShallNotAllow__Group__0 : rule__ShallNotAllow__Group__0__Impl rule__ShallNotAllow__Group__1 ;
    public final void rule__ShallNotAllow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:766:1: ( rule__ShallNotAllow__Group__0__Impl rule__ShallNotAllow__Group__1 )
            // InternalBoilerplateText.g:767:2: rule__ShallNotAllow__Group__0__Impl rule__ShallNotAllow__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ShallNotAllow__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__0"


    // $ANTLR start "rule__ShallNotAllow__Group__0__Impl"
    // InternalBoilerplateText.g:774:1: rule__ShallNotAllow__Group__0__Impl : ( 'shall' ) ;
    public final void rule__ShallNotAllow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:778:1: ( ( 'shall' ) )
            // InternalBoilerplateText.g:779:1: ( 'shall' )
            {
            // InternalBoilerplateText.g:779:1: ( 'shall' )
            // InternalBoilerplateText.g:780:2: 'shall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getShallKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getShallKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__0__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group__1"
    // InternalBoilerplateText.g:789:1: rule__ShallNotAllow__Group__1 : rule__ShallNotAllow__Group__1__Impl rule__ShallNotAllow__Group__2 ;
    public final void rule__ShallNotAllow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:793:1: ( rule__ShallNotAllow__Group__1__Impl rule__ShallNotAllow__Group__2 )
            // InternalBoilerplateText.g:794:2: rule__ShallNotAllow__Group__1__Impl rule__ShallNotAllow__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ShallNotAllow__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__1"


    // $ANTLR start "rule__ShallNotAllow__Group__1__Impl"
    // InternalBoilerplateText.g:801:1: rule__ShallNotAllow__Group__1__Impl : ( ( 'not' ) ) ;
    public final void rule__ShallNotAllow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:805:1: ( ( ( 'not' ) ) )
            // InternalBoilerplateText.g:806:1: ( ( 'not' ) )
            {
            // InternalBoilerplateText.g:806:1: ( ( 'not' ) )
            // InternalBoilerplateText.g:807:2: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getNotKeyword_1()); 
            }
            // InternalBoilerplateText.g:808:2: ( 'not' )
            // InternalBoilerplateText.g:808:3: 'not'
            {
            match(input,16,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getNotKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__1__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group__2"
    // InternalBoilerplateText.g:816:1: rule__ShallNotAllow__Group__2 : rule__ShallNotAllow__Group__2__Impl rule__ShallNotAllow__Group__3 ;
    public final void rule__ShallNotAllow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:820:1: ( rule__ShallNotAllow__Group__2__Impl rule__ShallNotAllow__Group__3 )
            // InternalBoilerplateText.g:821:2: rule__ShallNotAllow__Group__2__Impl rule__ShallNotAllow__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ShallNotAllow__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__2"


    // $ANTLR start "rule__ShallNotAllow__Group__2__Impl"
    // InternalBoilerplateText.g:828:1: rule__ShallNotAllow__Group__2__Impl : ( ( 'allow' ) ) ;
    public final void rule__ShallNotAllow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:832:1: ( ( ( 'allow' ) ) )
            // InternalBoilerplateText.g:833:1: ( ( 'allow' ) )
            {
            // InternalBoilerplateText.g:833:1: ( ( 'allow' ) )
            // InternalBoilerplateText.g:834:2: ( 'allow' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getAllowKeyword_2()); 
            }
            // InternalBoilerplateText.g:835:2: ( 'allow' )
            // InternalBoilerplateText.g:835:3: 'allow'
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getAllowKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__2__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group__3"
    // InternalBoilerplateText.g:843:1: rule__ShallNotAllow__Group__3 : rule__ShallNotAllow__Group__3__Impl ;
    public final void rule__ShallNotAllow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:847:1: ( rule__ShallNotAllow__Group__3__Impl )
            // InternalBoilerplateText.g:848:2: rule__ShallNotAllow__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__3"


    // $ANTLR start "rule__ShallNotAllow__Group__3__Impl"
    // InternalBoilerplateText.g:854:1: rule__ShallNotAllow__Group__3__Impl : ( ( rule__ShallNotAllow__Alternatives_3 ) ) ;
    public final void rule__ShallNotAllow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:858:1: ( ( ( rule__ShallNotAllow__Alternatives_3 ) ) )
            // InternalBoilerplateText.g:859:1: ( ( rule__ShallNotAllow__Alternatives_3 ) )
            {
            // InternalBoilerplateText.g:859:1: ( ( rule__ShallNotAllow__Alternatives_3 ) )
            // InternalBoilerplateText.g:860:2: ( rule__ShallNotAllow__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getAlternatives_3()); 
            }
            // InternalBoilerplateText.g:861:2: ( rule__ShallNotAllow__Alternatives_3 )
            // InternalBoilerplateText.g:861:3: rule__ShallNotAllow__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group__3__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group_3_1__0"
    // InternalBoilerplateText.g:870:1: rule__ShallNotAllow__Group_3_1__0 : rule__ShallNotAllow__Group_3_1__0__Impl rule__ShallNotAllow__Group_3_1__1 ;
    public final void rule__ShallNotAllow__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:874:1: ( rule__ShallNotAllow__Group_3_1__0__Impl rule__ShallNotAllow__Group_3_1__1 )
            // InternalBoilerplateText.g:875:2: rule__ShallNotAllow__Group_3_1__0__Impl rule__ShallNotAllow__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ShallNotAllow__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group_3_1__0"


    // $ANTLR start "rule__ShallNotAllow__Group_3_1__0__Impl"
    // InternalBoilerplateText.g:882:1: rule__ShallNotAllow__Group_3_1__0__Impl : ( ( rule__ShallNotAllow__EntityAssignment_3_1_0 ) ) ;
    public final void rule__ShallNotAllow__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:886:1: ( ( ( rule__ShallNotAllow__EntityAssignment_3_1_0 ) ) )
            // InternalBoilerplateText.g:887:1: ( ( rule__ShallNotAllow__EntityAssignment_3_1_0 ) )
            {
            // InternalBoilerplateText.g:887:1: ( ( rule__ShallNotAllow__EntityAssignment_3_1_0 ) )
            // InternalBoilerplateText.g:888:2: ( rule__ShallNotAllow__EntityAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getEntityAssignment_3_1_0()); 
            }
            // InternalBoilerplateText.g:889:2: ( rule__ShallNotAllow__EntityAssignment_3_1_0 )
            // InternalBoilerplateText.g:889:3: rule__ShallNotAllow__EntityAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__EntityAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getEntityAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group_3_1__0__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group_3_1__1"
    // InternalBoilerplateText.g:897:1: rule__ShallNotAllow__Group_3_1__1 : rule__ShallNotAllow__Group_3_1__1__Impl rule__ShallNotAllow__Group_3_1__2 ;
    public final void rule__ShallNotAllow__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:901:1: ( rule__ShallNotAllow__Group_3_1__1__Impl rule__ShallNotAllow__Group_3_1__2 )
            // InternalBoilerplateText.g:902:2: rule__ShallNotAllow__Group_3_1__1__Impl rule__ShallNotAllow__Group_3_1__2
            {
            pushFollow(FOLLOW_3);
            rule__ShallNotAllow__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group_3_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group_3_1__1"


    // $ANTLR start "rule__ShallNotAllow__Group_3_1__1__Impl"
    // InternalBoilerplateText.g:909:1: rule__ShallNotAllow__Group_3_1__1__Impl : ( 'to' ) ;
    public final void rule__ShallNotAllow__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:913:1: ( ( 'to' ) )
            // InternalBoilerplateText.g:914:1: ( 'to' )
            {
            // InternalBoilerplateText.g:914:1: ( 'to' )
            // InternalBoilerplateText.g:915:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getToKeyword_3_1_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getToKeyword_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group_3_1__1__Impl"


    // $ANTLR start "rule__ShallNotAllow__Group_3_1__2"
    // InternalBoilerplateText.g:924:1: rule__ShallNotAllow__Group_3_1__2 : rule__ShallNotAllow__Group_3_1__2__Impl ;
    public final void rule__ShallNotAllow__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:928:1: ( rule__ShallNotAllow__Group_3_1__2__Impl )
            // InternalBoilerplateText.g:929:2: rule__ShallNotAllow__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__Group_3_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group_3_1__2"


    // $ANTLR start "rule__ShallNotAllow__Group_3_1__2__Impl"
    // InternalBoilerplateText.g:935:1: rule__ShallNotAllow__Group_3_1__2__Impl : ( ( rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 ) ) ;
    public final void rule__ShallNotAllow__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:939:1: ( ( ( rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 ) ) )
            // InternalBoilerplateText.g:940:1: ( ( rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 ) )
            {
            // InternalBoilerplateText.g:940:1: ( ( rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 ) )
            // InternalBoilerplateText.g:941:2: ( rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getActionPerformedByEntityAssignment_3_1_2()); 
            }
            // InternalBoilerplateText.g:942:2: ( rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 )
            // InternalBoilerplateText.g:942:3: rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getActionPerformedByEntityAssignment_3_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__Group_3_1__2__Impl"


    // $ANTLR start "rule__ShallAllow__Group__0"
    // InternalBoilerplateText.g:951:1: rule__ShallAllow__Group__0 : rule__ShallAllow__Group__0__Impl rule__ShallAllow__Group__1 ;
    public final void rule__ShallAllow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:955:1: ( rule__ShallAllow__Group__0__Impl rule__ShallAllow__Group__1 )
            // InternalBoilerplateText.g:956:2: rule__ShallAllow__Group__0__Impl rule__ShallAllow__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__ShallAllow__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group__0"


    // $ANTLR start "rule__ShallAllow__Group__0__Impl"
    // InternalBoilerplateText.g:963:1: rule__ShallAllow__Group__0__Impl : ( 'shall' ) ;
    public final void rule__ShallAllow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:967:1: ( ( 'shall' ) )
            // InternalBoilerplateText.g:968:1: ( 'shall' )
            {
            // InternalBoilerplateText.g:968:1: ( 'shall' )
            // InternalBoilerplateText.g:969:2: 'shall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getShallKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getShallKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group__0__Impl"


    // $ANTLR start "rule__ShallAllow__Group__1"
    // InternalBoilerplateText.g:978:1: rule__ShallAllow__Group__1 : rule__ShallAllow__Group__1__Impl rule__ShallAllow__Group__2 ;
    public final void rule__ShallAllow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:982:1: ( rule__ShallAllow__Group__1__Impl rule__ShallAllow__Group__2 )
            // InternalBoilerplateText.g:983:2: rule__ShallAllow__Group__1__Impl rule__ShallAllow__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ShallAllow__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group__1"


    // $ANTLR start "rule__ShallAllow__Group__1__Impl"
    // InternalBoilerplateText.g:990:1: rule__ShallAllow__Group__1__Impl : ( ( 'allow' ) ) ;
    public final void rule__ShallAllow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:994:1: ( ( ( 'allow' ) ) )
            // InternalBoilerplateText.g:995:1: ( ( 'allow' ) )
            {
            // InternalBoilerplateText.g:995:1: ( ( 'allow' ) )
            // InternalBoilerplateText.g:996:2: ( 'allow' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getAllowKeyword_1()); 
            }
            // InternalBoilerplateText.g:997:2: ( 'allow' )
            // InternalBoilerplateText.g:997:3: 'allow'
            {
            match(input,17,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getAllowKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group__1__Impl"


    // $ANTLR start "rule__ShallAllow__Group__2"
    // InternalBoilerplateText.g:1005:1: rule__ShallAllow__Group__2 : rule__ShallAllow__Group__2__Impl ;
    public final void rule__ShallAllow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1009:1: ( rule__ShallAllow__Group__2__Impl )
            // InternalBoilerplateText.g:1010:2: rule__ShallAllow__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group__2"


    // $ANTLR start "rule__ShallAllow__Group__2__Impl"
    // InternalBoilerplateText.g:1016:1: rule__ShallAllow__Group__2__Impl : ( ( rule__ShallAllow__Alternatives_2 ) ) ;
    public final void rule__ShallAllow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1020:1: ( ( ( rule__ShallAllow__Alternatives_2 ) ) )
            // InternalBoilerplateText.g:1021:1: ( ( rule__ShallAllow__Alternatives_2 ) )
            {
            // InternalBoilerplateText.g:1021:1: ( ( rule__ShallAllow__Alternatives_2 ) )
            // InternalBoilerplateText.g:1022:2: ( rule__ShallAllow__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getAlternatives_2()); 
            }
            // InternalBoilerplateText.g:1023:2: ( rule__ShallAllow__Alternatives_2 )
            // InternalBoilerplateText.g:1023:3: rule__ShallAllow__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group__2__Impl"


    // $ANTLR start "rule__ShallAllow__Group_2_1__0"
    // InternalBoilerplateText.g:1032:1: rule__ShallAllow__Group_2_1__0 : rule__ShallAllow__Group_2_1__0__Impl rule__ShallAllow__Group_2_1__1 ;
    public final void rule__ShallAllow__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1036:1: ( rule__ShallAllow__Group_2_1__0__Impl rule__ShallAllow__Group_2_1__1 )
            // InternalBoilerplateText.g:1037:2: rule__ShallAllow__Group_2_1__0__Impl rule__ShallAllow__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ShallAllow__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group_2_1__0"


    // $ANTLR start "rule__ShallAllow__Group_2_1__0__Impl"
    // InternalBoilerplateText.g:1044:1: rule__ShallAllow__Group_2_1__0__Impl : ( ( rule__ShallAllow__EntityAssignment_2_1_0 ) ) ;
    public final void rule__ShallAllow__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1048:1: ( ( ( rule__ShallAllow__EntityAssignment_2_1_0 ) ) )
            // InternalBoilerplateText.g:1049:1: ( ( rule__ShallAllow__EntityAssignment_2_1_0 ) )
            {
            // InternalBoilerplateText.g:1049:1: ( ( rule__ShallAllow__EntityAssignment_2_1_0 ) )
            // InternalBoilerplateText.g:1050:2: ( rule__ShallAllow__EntityAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getEntityAssignment_2_1_0()); 
            }
            // InternalBoilerplateText.g:1051:2: ( rule__ShallAllow__EntityAssignment_2_1_0 )
            // InternalBoilerplateText.g:1051:3: rule__ShallAllow__EntityAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ShallAllow__EntityAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getEntityAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group_2_1__0__Impl"


    // $ANTLR start "rule__ShallAllow__Group_2_1__1"
    // InternalBoilerplateText.g:1059:1: rule__ShallAllow__Group_2_1__1 : rule__ShallAllow__Group_2_1__1__Impl rule__ShallAllow__Group_2_1__2 ;
    public final void rule__ShallAllow__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1063:1: ( rule__ShallAllow__Group_2_1__1__Impl rule__ShallAllow__Group_2_1__2 )
            // InternalBoilerplateText.g:1064:2: rule__ShallAllow__Group_2_1__1__Impl rule__ShallAllow__Group_2_1__2
            {
            pushFollow(FOLLOW_3);
            rule__ShallAllow__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group_2_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group_2_1__1"


    // $ANTLR start "rule__ShallAllow__Group_2_1__1__Impl"
    // InternalBoilerplateText.g:1071:1: rule__ShallAllow__Group_2_1__1__Impl : ( 'to' ) ;
    public final void rule__ShallAllow__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1075:1: ( ( 'to' ) )
            // InternalBoilerplateText.g:1076:1: ( 'to' )
            {
            // InternalBoilerplateText.g:1076:1: ( 'to' )
            // InternalBoilerplateText.g:1077:2: 'to'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getToKeyword_2_1_1()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getToKeyword_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group_2_1__1__Impl"


    // $ANTLR start "rule__ShallAllow__Group_2_1__2"
    // InternalBoilerplateText.g:1086:1: rule__ShallAllow__Group_2_1__2 : rule__ShallAllow__Group_2_1__2__Impl ;
    public final void rule__ShallAllow__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1090:1: ( rule__ShallAllow__Group_2_1__2__Impl )
            // InternalBoilerplateText.g:1091:2: rule__ShallAllow__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShallAllow__Group_2_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group_2_1__2"


    // $ANTLR start "rule__ShallAllow__Group_2_1__2__Impl"
    // InternalBoilerplateText.g:1097:1: rule__ShallAllow__Group_2_1__2__Impl : ( ( rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 ) ) ;
    public final void rule__ShallAllow__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1101:1: ( ( ( rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 ) ) )
            // InternalBoilerplateText.g:1102:1: ( ( rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 ) )
            {
            // InternalBoilerplateText.g:1102:1: ( ( rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 ) )
            // InternalBoilerplateText.g:1103:2: ( rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getActionPerformedByEntityAssignment_2_1_2()); 
            }
            // InternalBoilerplateText.g:1104:2: ( rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 )
            // InternalBoilerplateText.g:1104:3: rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getActionPerformedByEntityAssignment_2_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__Group_2_1__2__Impl"


    // $ANTLR start "rule__ShallNot__Group__0"
    // InternalBoilerplateText.g:1113:1: rule__ShallNot__Group__0 : rule__ShallNot__Group__0__Impl rule__ShallNot__Group__1 ;
    public final void rule__ShallNot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1117:1: ( rule__ShallNot__Group__0__Impl rule__ShallNot__Group__1 )
            // InternalBoilerplateText.g:1118:2: rule__ShallNot__Group__0__Impl rule__ShallNot__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ShallNot__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__0"


    // $ANTLR start "rule__ShallNot__Group__0__Impl"
    // InternalBoilerplateText.g:1125:1: rule__ShallNot__Group__0__Impl : ( 'shall' ) ;
    public final void rule__ShallNot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1129:1: ( ( 'shall' ) )
            // InternalBoilerplateText.g:1130:1: ( 'shall' )
            {
            // InternalBoilerplateText.g:1130:1: ( 'shall' )
            // InternalBoilerplateText.g:1131:2: 'shall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getShallKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getShallKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__0__Impl"


    // $ANTLR start "rule__ShallNot__Group__1"
    // InternalBoilerplateText.g:1140:1: rule__ShallNot__Group__1 : rule__ShallNot__Group__1__Impl rule__ShallNot__Group__2 ;
    public final void rule__ShallNot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1144:1: ( rule__ShallNot__Group__1__Impl rule__ShallNot__Group__2 )
            // InternalBoilerplateText.g:1145:2: rule__ShallNot__Group__1__Impl rule__ShallNot__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ShallNot__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__1"


    // $ANTLR start "rule__ShallNot__Group__1__Impl"
    // InternalBoilerplateText.g:1152:1: rule__ShallNot__Group__1__Impl : ( ( 'not' ) ) ;
    public final void rule__ShallNot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1156:1: ( ( ( 'not' ) ) )
            // InternalBoilerplateText.g:1157:1: ( ( 'not' ) )
            {
            // InternalBoilerplateText.g:1157:1: ( ( 'not' ) )
            // InternalBoilerplateText.g:1158:2: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getNotKeyword_1()); 
            }
            // InternalBoilerplateText.g:1159:2: ( 'not' )
            // InternalBoilerplateText.g:1159:3: 'not'
            {
            match(input,16,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getNotKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__1__Impl"


    // $ANTLR start "rule__ShallNot__Group__2"
    // InternalBoilerplateText.g:1167:1: rule__ShallNot__Group__2 : rule__ShallNot__Group__2__Impl rule__ShallNot__Group__3 ;
    public final void rule__ShallNot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1171:1: ( rule__ShallNot__Group__2__Impl rule__ShallNot__Group__3 )
            // InternalBoilerplateText.g:1172:2: rule__ShallNot__Group__2__Impl rule__ShallNot__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ShallNot__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__2"


    // $ANTLR start "rule__ShallNot__Group__2__Impl"
    // InternalBoilerplateText.g:1179:1: rule__ShallNot__Group__2__Impl : ( ( rule__ShallNot__Group_2__0 )? ) ;
    public final void rule__ShallNot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1183:1: ( ( ( rule__ShallNot__Group_2__0 )? ) )
            // InternalBoilerplateText.g:1184:1: ( ( rule__ShallNot__Group_2__0 )? )
            {
            // InternalBoilerplateText.g:1184:1: ( ( rule__ShallNot__Group_2__0 )? )
            // InternalBoilerplateText.g:1185:2: ( rule__ShallNot__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getGroup_2()); 
            }
            // InternalBoilerplateText.g:1186:2: ( rule__ShallNot__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoilerplateText.g:1186:3: rule__ShallNot__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ShallNot__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__2__Impl"


    // $ANTLR start "rule__ShallNot__Group__3"
    // InternalBoilerplateText.g:1194:1: rule__ShallNot__Group__3 : rule__ShallNot__Group__3__Impl ;
    public final void rule__ShallNot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1198:1: ( rule__ShallNot__Group__3__Impl )
            // InternalBoilerplateText.g:1199:2: rule__ShallNot__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__3"


    // $ANTLR start "rule__ShallNot__Group__3__Impl"
    // InternalBoilerplateText.g:1205:1: rule__ShallNot__Group__3__Impl : ( ( rule__ShallNot__ActionAssignment_3 ) ) ;
    public final void rule__ShallNot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1209:1: ( ( ( rule__ShallNot__ActionAssignment_3 ) ) )
            // InternalBoilerplateText.g:1210:1: ( ( rule__ShallNot__ActionAssignment_3 ) )
            {
            // InternalBoilerplateText.g:1210:1: ( ( rule__ShallNot__ActionAssignment_3 ) )
            // InternalBoilerplateText.g:1211:2: ( rule__ShallNot__ActionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getActionAssignment_3()); 
            }
            // InternalBoilerplateText.g:1212:2: ( rule__ShallNot__ActionAssignment_3 )
            // InternalBoilerplateText.g:1212:3: rule__ShallNot__ActionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ShallNot__ActionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getActionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group__3__Impl"


    // $ANTLR start "rule__ShallNot__Group_2__0"
    // InternalBoilerplateText.g:1221:1: rule__ShallNot__Group_2__0 : rule__ShallNot__Group_2__0__Impl rule__ShallNot__Group_2__1 ;
    public final void rule__ShallNot__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1225:1: ( rule__ShallNot__Group_2__0__Impl rule__ShallNot__Group_2__1 )
            // InternalBoilerplateText.g:1226:2: rule__ShallNot__Group_2__0__Impl rule__ShallNot__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ShallNot__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group_2__0"


    // $ANTLR start "rule__ShallNot__Group_2__0__Impl"
    // InternalBoilerplateText.g:1233:1: rule__ShallNot__Group_2__0__Impl : ( 'be' ) ;
    public final void rule__ShallNot__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1237:1: ( ( 'be' ) )
            // InternalBoilerplateText.g:1238:1: ( 'be' )
            {
            // InternalBoilerplateText.g:1238:1: ( 'be' )
            // InternalBoilerplateText.g:1239:2: 'be'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getBeKeyword_2_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getBeKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group_2__0__Impl"


    // $ANTLR start "rule__ShallNot__Group_2__1"
    // InternalBoilerplateText.g:1248:1: rule__ShallNot__Group_2__1 : rule__ShallNot__Group_2__1__Impl rule__ShallNot__Group_2__2 ;
    public final void rule__ShallNot__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1252:1: ( rule__ShallNot__Group_2__1__Impl rule__ShallNot__Group_2__2 )
            // InternalBoilerplateText.g:1253:2: rule__ShallNot__Group_2__1__Impl rule__ShallNot__Group_2__2
            {
            pushFollow(FOLLOW_10);
            rule__ShallNot__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group_2__1"


    // $ANTLR start "rule__ShallNot__Group_2__1__Impl"
    // InternalBoilerplateText.g:1260:1: rule__ShallNot__Group_2__1__Impl : ( ( 'able' ) ) ;
    public final void rule__ShallNot__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1264:1: ( ( ( 'able' ) ) )
            // InternalBoilerplateText.g:1265:1: ( ( 'able' ) )
            {
            // InternalBoilerplateText.g:1265:1: ( ( 'able' ) )
            // InternalBoilerplateText.g:1266:2: ( 'able' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getAbleKeyword_2_1()); 
            }
            // InternalBoilerplateText.g:1267:2: ( 'able' )
            // InternalBoilerplateText.g:1267:3: 'able'
            {
            match(input,20,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getAbleKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group_2__1__Impl"


    // $ANTLR start "rule__ShallNot__Group_2__2"
    // InternalBoilerplateText.g:1275:1: rule__ShallNot__Group_2__2 : rule__ShallNot__Group_2__2__Impl ;
    public final void rule__ShallNot__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1279:1: ( rule__ShallNot__Group_2__2__Impl )
            // InternalBoilerplateText.g:1280:2: rule__ShallNot__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ShallNot__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group_2__2"


    // $ANTLR start "rule__ShallNot__Group_2__2__Impl"
    // InternalBoilerplateText.g:1286:1: rule__ShallNot__Group_2__2__Impl : ( ( 'to' ) ) ;
    public final void rule__ShallNot__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1290:1: ( ( ( 'to' ) ) )
            // InternalBoilerplateText.g:1291:1: ( ( 'to' ) )
            {
            // InternalBoilerplateText.g:1291:1: ( ( 'to' ) )
            // InternalBoilerplateText.g:1292:2: ( 'to' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getToKeyword_2_2()); 
            }
            // InternalBoilerplateText.g:1293:2: ( 'to' )
            // InternalBoilerplateText.g:1293:3: 'to'
            {
            match(input,18,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getToKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__Group_2__2__Impl"


    // $ANTLR start "rule__Shall__Group__0"
    // InternalBoilerplateText.g:1302:1: rule__Shall__Group__0 : rule__Shall__Group__0__Impl rule__Shall__Group__1 ;
    public final void rule__Shall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1306:1: ( rule__Shall__Group__0__Impl rule__Shall__Group__1 )
            // InternalBoilerplateText.g:1307:2: rule__Shall__Group__0__Impl rule__Shall__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Shall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group__0"


    // $ANTLR start "rule__Shall__Group__0__Impl"
    // InternalBoilerplateText.g:1314:1: rule__Shall__Group__0__Impl : ( 'shall' ) ;
    public final void rule__Shall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1318:1: ( ( 'shall' ) )
            // InternalBoilerplateText.g:1319:1: ( 'shall' )
            {
            // InternalBoilerplateText.g:1319:1: ( 'shall' )
            // InternalBoilerplateText.g:1320:2: 'shall'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getShallKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getShallKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group__0__Impl"


    // $ANTLR start "rule__Shall__Group__1"
    // InternalBoilerplateText.g:1329:1: rule__Shall__Group__1 : rule__Shall__Group__1__Impl rule__Shall__Group__2 ;
    public final void rule__Shall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1333:1: ( rule__Shall__Group__1__Impl rule__Shall__Group__2 )
            // InternalBoilerplateText.g:1334:2: rule__Shall__Group__1__Impl rule__Shall__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Shall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group__1"


    // $ANTLR start "rule__Shall__Group__1__Impl"
    // InternalBoilerplateText.g:1341:1: rule__Shall__Group__1__Impl : ( ( rule__Shall__Group_1__0 )? ) ;
    public final void rule__Shall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1345:1: ( ( ( rule__Shall__Group_1__0 )? ) )
            // InternalBoilerplateText.g:1346:1: ( ( rule__Shall__Group_1__0 )? )
            {
            // InternalBoilerplateText.g:1346:1: ( ( rule__Shall__Group_1__0 )? )
            // InternalBoilerplateText.g:1347:2: ( rule__Shall__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getGroup_1()); 
            }
            // InternalBoilerplateText.g:1348:2: ( rule__Shall__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoilerplateText.g:1348:3: rule__Shall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Shall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group__1__Impl"


    // $ANTLR start "rule__Shall__Group__2"
    // InternalBoilerplateText.g:1356:1: rule__Shall__Group__2 : rule__Shall__Group__2__Impl ;
    public final void rule__Shall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1360:1: ( rule__Shall__Group__2__Impl )
            // InternalBoilerplateText.g:1361:2: rule__Shall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group__2"


    // $ANTLR start "rule__Shall__Group__2__Impl"
    // InternalBoilerplateText.g:1367:1: rule__Shall__Group__2__Impl : ( ( rule__Shall__ActionAssignment_2 ) ) ;
    public final void rule__Shall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1371:1: ( ( ( rule__Shall__ActionAssignment_2 ) ) )
            // InternalBoilerplateText.g:1372:1: ( ( rule__Shall__ActionAssignment_2 ) )
            {
            // InternalBoilerplateText.g:1372:1: ( ( rule__Shall__ActionAssignment_2 ) )
            // InternalBoilerplateText.g:1373:2: ( rule__Shall__ActionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getActionAssignment_2()); 
            }
            // InternalBoilerplateText.g:1374:2: ( rule__Shall__ActionAssignment_2 )
            // InternalBoilerplateText.g:1374:3: rule__Shall__ActionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Shall__ActionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getActionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group__2__Impl"


    // $ANTLR start "rule__Shall__Group_1__0"
    // InternalBoilerplateText.g:1383:1: rule__Shall__Group_1__0 : rule__Shall__Group_1__0__Impl ;
    public final void rule__Shall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1387:1: ( rule__Shall__Group_1__0__Impl )
            // InternalBoilerplateText.g:1388:2: rule__Shall__Group_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1__0"


    // $ANTLR start "rule__Shall__Group_1__0__Impl"
    // InternalBoilerplateText.g:1394:1: rule__Shall__Group_1__0__Impl : ( ( rule__Shall__Group_1_0__0 ) ) ;
    public final void rule__Shall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1398:1: ( ( ( rule__Shall__Group_1_0__0 ) ) )
            // InternalBoilerplateText.g:1399:1: ( ( rule__Shall__Group_1_0__0 ) )
            {
            // InternalBoilerplateText.g:1399:1: ( ( rule__Shall__Group_1_0__0 ) )
            // InternalBoilerplateText.g:1400:2: ( rule__Shall__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getGroup_1_0()); 
            }
            // InternalBoilerplateText.g:1401:2: ( rule__Shall__Group_1_0__0 )
            // InternalBoilerplateText.g:1401:3: rule__Shall__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Shall__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1__0__Impl"


    // $ANTLR start "rule__Shall__Group_1_0__0"
    // InternalBoilerplateText.g:1410:1: rule__Shall__Group_1_0__0 : rule__Shall__Group_1_0__0__Impl rule__Shall__Group_1_0__1 ;
    public final void rule__Shall__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1414:1: ( rule__Shall__Group_1_0__0__Impl rule__Shall__Group_1_0__1 )
            // InternalBoilerplateText.g:1415:2: rule__Shall__Group_1_0__0__Impl rule__Shall__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Shall__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shall__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1_0__0"


    // $ANTLR start "rule__Shall__Group_1_0__0__Impl"
    // InternalBoilerplateText.g:1422:1: rule__Shall__Group_1_0__0__Impl : ( 'be' ) ;
    public final void rule__Shall__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1426:1: ( ( 'be' ) )
            // InternalBoilerplateText.g:1427:1: ( 'be' )
            {
            // InternalBoilerplateText.g:1427:1: ( 'be' )
            // InternalBoilerplateText.g:1428:2: 'be'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getBeKeyword_1_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getBeKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1_0__0__Impl"


    // $ANTLR start "rule__Shall__Group_1_0__1"
    // InternalBoilerplateText.g:1437:1: rule__Shall__Group_1_0__1 : rule__Shall__Group_1_0__1__Impl rule__Shall__Group_1_0__2 ;
    public final void rule__Shall__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1441:1: ( rule__Shall__Group_1_0__1__Impl rule__Shall__Group_1_0__2 )
            // InternalBoilerplateText.g:1442:2: rule__Shall__Group_1_0__1__Impl rule__Shall__Group_1_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Shall__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Shall__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1_0__1"


    // $ANTLR start "rule__Shall__Group_1_0__1__Impl"
    // InternalBoilerplateText.g:1449:1: rule__Shall__Group_1_0__1__Impl : ( ( 'able' ) ) ;
    public final void rule__Shall__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1453:1: ( ( ( 'able' ) ) )
            // InternalBoilerplateText.g:1454:1: ( ( 'able' ) )
            {
            // InternalBoilerplateText.g:1454:1: ( ( 'able' ) )
            // InternalBoilerplateText.g:1455:2: ( 'able' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getAbleKeyword_1_0_1()); 
            }
            // InternalBoilerplateText.g:1456:2: ( 'able' )
            // InternalBoilerplateText.g:1456:3: 'able'
            {
            match(input,20,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getAbleKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1_0__1__Impl"


    // $ANTLR start "rule__Shall__Group_1_0__2"
    // InternalBoilerplateText.g:1464:1: rule__Shall__Group_1_0__2 : rule__Shall__Group_1_0__2__Impl ;
    public final void rule__Shall__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1468:1: ( rule__Shall__Group_1_0__2__Impl )
            // InternalBoilerplateText.g:1469:2: rule__Shall__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Shall__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1_0__2"


    // $ANTLR start "rule__Shall__Group_1_0__2__Impl"
    // InternalBoilerplateText.g:1475:1: rule__Shall__Group_1_0__2__Impl : ( ( 'to' ) ) ;
    public final void rule__Shall__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1479:1: ( ( ( 'to' ) ) )
            // InternalBoilerplateText.g:1480:1: ( ( 'to' ) )
            {
            // InternalBoilerplateText.g:1480:1: ( ( 'to' ) )
            // InternalBoilerplateText.g:1481:2: ( 'to' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getToKeyword_1_0_2()); 
            }
            // InternalBoilerplateText.g:1482:2: ( 'to' )
            // InternalBoilerplateText.g:1482:3: 'to'
            {
            match(input,18,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getToKeyword_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__Group_1_0__2__Impl"


    // $ANTLR start "rule__Model__ModelAssignment"
    // InternalBoilerplateText.g:1491:1: rule__Model__ModelAssignment : ( ruleRequirement ) ;
    public final void rule__Model__ModelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1495:1: ( ( ruleRequirement ) )
            // InternalBoilerplateText.g:1496:2: ( ruleRequirement )
            {
            // InternalBoilerplateText.g:1496:2: ( ruleRequirement )
            // InternalBoilerplateText.g:1497:3: ruleRequirement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelRequirementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRequirement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelRequirementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelAssignment"


    // $ANTLR start "rule__Requirement__PrefixAssignment_0_0"
    // InternalBoilerplateText.g:1506:1: rule__Requirement__PrefixAssignment_0_0 : ( rulePrefix ) ;
    public final void rule__Requirement__PrefixAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1510:1: ( ( rulePrefix ) )
            // InternalBoilerplateText.g:1511:2: ( rulePrefix )
            {
            // InternalBoilerplateText.g:1511:2: ( rulePrefix )
            // InternalBoilerplateText.g:1512:3: rulePrefix
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getPrefixPrefixParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePrefix();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getPrefixPrefixParserRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__PrefixAssignment_0_0"


    // $ANTLR start "rule__Requirement__SystemAssignment_1"
    // InternalBoilerplateText.g:1521:1: rule__Requirement__SystemAssignment_1 : ( ruleSubject ) ;
    public final void rule__Requirement__SystemAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1525:1: ( ( ruleSubject ) )
            // InternalBoilerplateText.g:1526:2: ( ruleSubject )
            {
            // InternalBoilerplateText.g:1526:2: ( ruleSubject )
            // InternalBoilerplateText.g:1527:3: ruleSubject
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getSystemSubjectParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSubject();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getSystemSubjectParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__SystemAssignment_1"


    // $ANTLR start "rule__Requirement__PredicateAssignment_2"
    // InternalBoilerplateText.g:1536:1: rule__Requirement__PredicateAssignment_2 : ( rulePredicate ) ;
    public final void rule__Requirement__PredicateAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1540:1: ( ( rulePredicate ) )
            // InternalBoilerplateText.g:1541:2: ( rulePredicate )
            {
            // InternalBoilerplateText.g:1541:2: ( rulePredicate )
            // InternalBoilerplateText.g:1542:3: rulePredicate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequirementAccess().getPredicatePredicateParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequirementAccess().getPredicatePredicateParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Requirement__PredicateAssignment_2"


    // $ANTLR start "rule__Subject__SystemAssignment"
    // InternalBoilerplateText.g:1551:1: rule__Subject__SystemAssignment : ( RULE_STRING ) ;
    public final void rule__Subject__SystemAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1555:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1556:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1556:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1557:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubjectAccess().getSystemSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubjectAccess().getSystemSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subject__SystemAssignment"


    // $ANTLR start "rule__If__EventAssignment_1"
    // InternalBoilerplateText.g:1566:1: rule__If__EventAssignment_1 : ( RULE_STRING ) ;
    public final void rule__If__EventAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1570:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1571:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1571:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1572:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getEventSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getEventSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__EventAssignment_1"


    // $ANTLR start "rule__If__EventAssignment_2_1"
    // InternalBoilerplateText.g:1581:1: rule__If__EventAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__If__EventAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1585:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1586:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1586:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1587:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIfAccess().getEventSTRINGTerminalRuleCall_2_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIfAccess().getEventSTRINGTerminalRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__EventAssignment_2_1"


    // $ANTLR start "rule__While__StateAssignment_1"
    // InternalBoilerplateText.g:1596:1: rule__While__StateAssignment_1 : ( RULE_STRING ) ;
    public final void rule__While__StateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1600:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1601:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1601:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1602:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWhileAccess().getStateSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWhileAccess().getStateSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__While__StateAssignment_1"


    // $ANTLR start "rule__ShallNotAllow__ActionAssignment_3_0"
    // InternalBoilerplateText.g:1611:1: rule__ShallNotAllow__ActionAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__ShallNotAllow__ActionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1615:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1616:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1616:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1617:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getActionSTRINGTerminalRuleCall_3_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getActionSTRINGTerminalRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__ActionAssignment_3_0"


    // $ANTLR start "rule__ShallNotAllow__EntityAssignment_3_1_0"
    // InternalBoilerplateText.g:1626:1: rule__ShallNotAllow__EntityAssignment_3_1_0 : ( RULE_STRING ) ;
    public final void rule__ShallNotAllow__EntityAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1630:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1631:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1631:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1632:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getEntitySTRINGTerminalRuleCall_3_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getEntitySTRINGTerminalRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__EntityAssignment_3_1_0"


    // $ANTLR start "rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2"
    // InternalBoilerplateText.g:1641:1: rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2 : ( RULE_STRING ) ;
    public final void rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1645:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1646:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1646:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1647:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAllowAccess().getActionPerformedByEntitySTRINGTerminalRuleCall_3_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAllowAccess().getActionPerformedByEntitySTRINGTerminalRuleCall_3_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNotAllow__ActionPerformedByEntityAssignment_3_1_2"


    // $ANTLR start "rule__ShallAllow__ActionAssignment_2_0"
    // InternalBoilerplateText.g:1656:1: rule__ShallAllow__ActionAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__ShallAllow__ActionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1660:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1661:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1661:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1662:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getActionSTRINGTerminalRuleCall_2_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getActionSTRINGTerminalRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__ActionAssignment_2_0"


    // $ANTLR start "rule__ShallAllow__EntityAssignment_2_1_0"
    // InternalBoilerplateText.g:1671:1: rule__ShallAllow__EntityAssignment_2_1_0 : ( RULE_STRING ) ;
    public final void rule__ShallAllow__EntityAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1675:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1676:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1676:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1677:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getEntitySTRINGTerminalRuleCall_2_1_0_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getEntitySTRINGTerminalRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__EntityAssignment_2_1_0"


    // $ANTLR start "rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2"
    // InternalBoilerplateText.g:1686:1: rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2 : ( RULE_STRING ) ;
    public final void rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1690:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1691:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1691:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1692:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAllowAccess().getActionPerformedByEntitySTRINGTerminalRuleCall_2_1_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAllowAccess().getActionPerformedByEntitySTRINGTerminalRuleCall_2_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallAllow__ActionPerformedByEntityAssignment_2_1_2"


    // $ANTLR start "rule__ShallNot__ActionAssignment_3"
    // InternalBoilerplateText.g:1701:1: rule__ShallNot__ActionAssignment_3 : ( RULE_STRING ) ;
    public final void rule__ShallNot__ActionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1705:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1706:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1706:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1707:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallNotAccess().getActionSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallNotAccess().getActionSTRINGTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ShallNot__ActionAssignment_3"


    // $ANTLR start "rule__Shall__ActionAssignment_2"
    // InternalBoilerplateText.g:1716:1: rule__Shall__ActionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Shall__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoilerplateText.g:1720:1: ( ( RULE_STRING ) )
            // InternalBoilerplateText.g:1721:2: ( RULE_STRING )
            {
            // InternalBoilerplateText.g:1721:2: ( RULE_STRING )
            // InternalBoilerplateText.g:1722:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getShallAccess().getActionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getShallAccess().getActionSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Shall__ActionAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}