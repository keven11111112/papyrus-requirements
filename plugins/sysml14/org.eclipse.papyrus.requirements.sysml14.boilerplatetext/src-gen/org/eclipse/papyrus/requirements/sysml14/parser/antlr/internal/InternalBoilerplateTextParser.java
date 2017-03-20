package org.eclipse.papyrus.requirements.sysml14.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
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
public class InternalBoilerplateTextParser extends AbstractInternalAntlrParser {
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

        public InternalBoilerplateTextParser(TokenStream input, BoilerplateTextGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BoilerplateTextGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBoilerplateText.g:78:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBoilerplateText.g:78:46: (iv_ruleModel= ruleModel EOF )
            // InternalBoilerplateText.g:79:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBoilerplateText.g:85:1: ruleModel returns [EObject current=null] : ( (lv_model_0_0= ruleRequirement ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_model_0_0 = null;



        	enterRule();

        try {
            // InternalBoilerplateText.g:91:2: ( ( (lv_model_0_0= ruleRequirement ) ) )
            // InternalBoilerplateText.g:92:2: ( (lv_model_0_0= ruleRequirement ) )
            {
            // InternalBoilerplateText.g:92:2: ( (lv_model_0_0= ruleRequirement ) )
            // InternalBoilerplateText.g:93:3: (lv_model_0_0= ruleRequirement )
            {
            // InternalBoilerplateText.g:93:3: (lv_model_0_0= ruleRequirement )
            // InternalBoilerplateText.g:94:4: lv_model_0_0= ruleRequirement
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getModelAccess().getModelRequirementParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_model_0_0=ruleRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getModelRule());
              				}
              				set(
              					current,
              					"model",
              					lv_model_0_0,
              					"org.eclipse.papyrus.requirements.sysml14.BoilerplateText.Requirement");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRequirement"
    // InternalBoilerplateText.g:114:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalBoilerplateText.g:114:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalBoilerplateText.g:115:2: iv_ruleRequirement= ruleRequirement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequirementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequirement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalBoilerplateText.g:121:1: ruleRequirement returns [EObject current=null] : ( ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ',' )? ( (lv_system_2_0= ruleSubject ) ) ( (lv_predicate_3_0= rulePredicate ) ) ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_prefix_0_0 = null;

        EObject lv_system_2_0 = null;

        EObject lv_predicate_3_0 = null;



        	enterRule();

        try {
            // InternalBoilerplateText.g:127:2: ( ( ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ',' )? ( (lv_system_2_0= ruleSubject ) ) ( (lv_predicate_3_0= rulePredicate ) ) ) )
            // InternalBoilerplateText.g:128:2: ( ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ',' )? ( (lv_system_2_0= ruleSubject ) ) ( (lv_predicate_3_0= rulePredicate ) ) )
            {
            // InternalBoilerplateText.g:128:2: ( ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ',' )? ( (lv_system_2_0= ruleSubject ) ) ( (lv_predicate_3_0= rulePredicate ) ) )
            // InternalBoilerplateText.g:129:3: ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ',' )? ( (lv_system_2_0= ruleSubject ) ) ( (lv_predicate_3_0= rulePredicate ) )
            {
            // InternalBoilerplateText.g:129:3: ( ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ',' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12||LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBoilerplateText.g:130:4: ( (lv_prefix_0_0= rulePrefix ) ) otherlv_1= ','
                    {
                    // InternalBoilerplateText.g:130:4: ( (lv_prefix_0_0= rulePrefix ) )
                    // InternalBoilerplateText.g:131:5: (lv_prefix_0_0= rulePrefix )
                    {
                    // InternalBoilerplateText.g:131:5: (lv_prefix_0_0= rulePrefix )
                    // InternalBoilerplateText.g:132:6: lv_prefix_0_0= rulePrefix
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRequirementAccess().getPrefixPrefixParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_prefix_0_0=rulePrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRequirementRule());
                      						}
                      						set(
                      							current,
                      							"prefix",
                      							lv_prefix_0_0,
                      							"org.eclipse.papyrus.requirements.sysml14.BoilerplateText.Prefix");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getCommaKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalBoilerplateText.g:154:3: ( (lv_system_2_0= ruleSubject ) )
            // InternalBoilerplateText.g:155:4: (lv_system_2_0= ruleSubject )
            {
            // InternalBoilerplateText.g:155:4: (lv_system_2_0= ruleSubject )
            // InternalBoilerplateText.g:156:5: lv_system_2_0= ruleSubject
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequirementAccess().getSystemSubjectParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_system_2_0=ruleSubject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequirementRule());
              					}
              					set(
              						current,
              						"system",
              						lv_system_2_0,
              						"org.eclipse.papyrus.requirements.sysml14.BoilerplateText.Subject");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalBoilerplateText.g:173:3: ( (lv_predicate_3_0= rulePredicate ) )
            // InternalBoilerplateText.g:174:4: (lv_predicate_3_0= rulePredicate )
            {
            // InternalBoilerplateText.g:174:4: (lv_predicate_3_0= rulePredicate )
            // InternalBoilerplateText.g:175:5: lv_predicate_3_0= rulePredicate
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequirementAccess().getPredicatePredicateParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_predicate_3_0=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequirementRule());
              					}
              					set(
              						current,
              						"predicate",
              						lv_predicate_3_0,
              						"org.eclipse.papyrus.requirements.sysml14.BoilerplateText.Predicate");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleSubject"
    // InternalBoilerplateText.g:196:1: entryRuleSubject returns [EObject current=null] : iv_ruleSubject= ruleSubject EOF ;
    public final EObject entryRuleSubject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubject = null;


        try {
            // InternalBoilerplateText.g:196:48: (iv_ruleSubject= ruleSubject EOF )
            // InternalBoilerplateText.g:197:2: iv_ruleSubject= ruleSubject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubject=ruleSubject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubject"


    // $ANTLR start "ruleSubject"
    // InternalBoilerplateText.g:203:1: ruleSubject returns [EObject current=null] : ( (lv_system_0_0= RULE_STRING ) ) ;
    public final EObject ruleSubject() throws RecognitionException {
        EObject current = null;

        Token lv_system_0_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:209:2: ( ( (lv_system_0_0= RULE_STRING ) ) )
            // InternalBoilerplateText.g:210:2: ( (lv_system_0_0= RULE_STRING ) )
            {
            // InternalBoilerplateText.g:210:2: ( (lv_system_0_0= RULE_STRING ) )
            // InternalBoilerplateText.g:211:3: (lv_system_0_0= RULE_STRING )
            {
            // InternalBoilerplateText.g:211:3: (lv_system_0_0= RULE_STRING )
            // InternalBoilerplateText.g:212:4: lv_system_0_0= RULE_STRING
            {
            lv_system_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_system_0_0, grammarAccess.getSubjectAccess().getSystemSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSubjectRule());
              				}
              				setWithLastConsumed(
              					current,
              					"system",
              					lv_system_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubject"


    // $ANTLR start "entryRulePrefix"
    // InternalBoilerplateText.g:231:1: entryRulePrefix returns [EObject current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final EObject entryRulePrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrefix = null;


        try {
            // InternalBoilerplateText.g:231:47: (iv_rulePrefix= rulePrefix EOF )
            // InternalBoilerplateText.g:232:2: iv_rulePrefix= rulePrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrefix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalBoilerplateText.g:238:1: rulePrefix returns [EObject current=null] : (this_If_0= ruleIf | this_While_1= ruleWhile ) ;
    public final EObject rulePrefix() throws RecognitionException {
        EObject current = null;

        EObject this_If_0 = null;

        EObject this_While_1 = null;



        	enterRule();

        try {
            // InternalBoilerplateText.g:244:2: ( (this_If_0= ruleIf | this_While_1= ruleWhile ) )
            // InternalBoilerplateText.g:245:2: (this_If_0= ruleIf | this_While_1= ruleWhile )
            {
            // InternalBoilerplateText.g:245:2: (this_If_0= ruleIf | this_While_1= ruleWhile )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBoilerplateText.g:246:3: this_If_0= ruleIf
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixAccess().getIfParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_If_0=ruleIf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_If_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:255:3: this_While_1= ruleWhile
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrefixAccess().getWhileParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_While_1=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_While_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleIf"
    // InternalBoilerplateText.g:267:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalBoilerplateText.g:267:43: (iv_ruleIf= ruleIf EOF )
            // InternalBoilerplateText.g:268:2: iv_ruleIf= ruleIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalBoilerplateText.g:274:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' ( (lv_event_1_0= RULE_STRING ) ) (otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_event_1_0=null;
        Token otherlv_2=null;
        Token lv_event_3_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:280:2: ( (otherlv_0= 'if' ( (lv_event_1_0= RULE_STRING ) ) (otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) ) )* ) )
            // InternalBoilerplateText.g:281:2: (otherlv_0= 'if' ( (lv_event_1_0= RULE_STRING ) ) (otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) ) )* )
            {
            // InternalBoilerplateText.g:281:2: (otherlv_0= 'if' ( (lv_event_1_0= RULE_STRING ) ) (otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) ) )* )
            // InternalBoilerplateText.g:282:3: otherlv_0= 'if' ( (lv_event_1_0= RULE_STRING ) ) (otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
              		
            }
            // InternalBoilerplateText.g:286:3: ( (lv_event_1_0= RULE_STRING ) )
            // InternalBoilerplateText.g:287:4: (lv_event_1_0= RULE_STRING )
            {
            // InternalBoilerplateText.g:287:4: (lv_event_1_0= RULE_STRING )
            // InternalBoilerplateText.g:288:5: lv_event_1_0= RULE_STRING
            {
            lv_event_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_event_1_0, grammarAccess.getIfAccess().getEventSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIfRule());
              					}
              					addWithLastConsumed(
              						current,
              						"event",
              						lv_event_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            // InternalBoilerplateText.g:304:3: (otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBoilerplateText.g:305:4: otherlv_2= 'and' ( (lv_event_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getIfAccess().getAndKeyword_2_0());
            	      			
            	    }
            	    // InternalBoilerplateText.g:309:4: ( (lv_event_3_0= RULE_STRING ) )
            	    // InternalBoilerplateText.g:310:5: (lv_event_3_0= RULE_STRING )
            	    {
            	    // InternalBoilerplateText.g:310:5: (lv_event_3_0= RULE_STRING )
            	    // InternalBoilerplateText.g:311:6: lv_event_3_0= RULE_STRING
            	    {
            	    lv_event_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_event_3_0, grammarAccess.getIfAccess().getEventSTRINGTerminalRuleCall_2_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getIfRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"event",
            	      							lv_event_3_0,
            	      							"org.eclipse.xtext.common.Terminals.STRING");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleWhile"
    // InternalBoilerplateText.g:332:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalBoilerplateText.g:332:46: (iv_ruleWhile= ruleWhile EOF )
            // InternalBoilerplateText.g:333:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalBoilerplateText.g:339:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' ( (lv_state_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_state_1_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:345:2: ( (otherlv_0= 'while' ( (lv_state_1_0= RULE_STRING ) ) ) )
            // InternalBoilerplateText.g:346:2: (otherlv_0= 'while' ( (lv_state_1_0= RULE_STRING ) ) )
            {
            // InternalBoilerplateText.g:346:2: (otherlv_0= 'while' ( (lv_state_1_0= RULE_STRING ) ) )
            // InternalBoilerplateText.g:347:3: otherlv_0= 'while' ( (lv_state_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
              		
            }
            // InternalBoilerplateText.g:351:3: ( (lv_state_1_0= RULE_STRING ) )
            // InternalBoilerplateText.g:352:4: (lv_state_1_0= RULE_STRING )
            {
            // InternalBoilerplateText.g:352:4: (lv_state_1_0= RULE_STRING )
            // InternalBoilerplateText.g:353:5: lv_state_1_0= RULE_STRING
            {
            lv_state_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_state_1_0, grammarAccess.getWhileAccess().getStateSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getWhileRule());
              					}
              					setWithLastConsumed(
              						current,
              						"state",
              						lv_state_1_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRulePredicate"
    // InternalBoilerplateText.g:373:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalBoilerplateText.g:373:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalBoilerplateText.g:374:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalBoilerplateText.g:380:1: rulePredicate returns [EObject current=null] : (this_Shall_0= ruleShall | this_ShallNot_1= ruleShallNot | this_ShallAllow_2= ruleShallAllow | this_ShallNotAllow_3= ruleShallNotAllow ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_Shall_0 = null;

        EObject this_ShallNot_1 = null;

        EObject this_ShallAllow_2 = null;

        EObject this_ShallNotAllow_3 = null;



        	enterRule();

        try {
            // InternalBoilerplateText.g:386:2: ( (this_Shall_0= ruleShall | this_ShallNot_1= ruleShallNot | this_ShallAllow_2= ruleShallAllow | this_ShallNotAllow_3= ruleShallNotAllow ) )
            // InternalBoilerplateText.g:387:2: (this_Shall_0= ruleShall | this_ShallNot_1= ruleShallNot | this_ShallAllow_2= ruleShallAllow | this_ShallNotAllow_3= ruleShallNotAllow )
            {
            // InternalBoilerplateText.g:387:2: (this_Shall_0= ruleShall | this_ShallNot_1= ruleShallNot | this_ShallAllow_2= ruleShallAllow | this_ShallNotAllow_3= ruleShallNotAllow )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_STRING||LA4_2==19) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==17) ) {
                        alt4=4;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_STRING:
                case 19:
                    {
                    alt4=1;
                    }
                    break;
                case 17:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBoilerplateText.g:388:3: this_Shall_0= ruleShall
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredicateAccess().getShallParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Shall_0=ruleShall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Shall_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:397:3: this_ShallNot_1= ruleShallNot
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredicateAccess().getShallNotParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShallNot_1=ruleShallNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShallNot_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalBoilerplateText.g:406:3: this_ShallAllow_2= ruleShallAllow
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredicateAccess().getShallAllowParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShallAllow_2=ruleShallAllow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShallAllow_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalBoilerplateText.g:415:3: this_ShallNotAllow_3= ruleShallNotAllow
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPredicateAccess().getShallNotAllowParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ShallNotAllow_3=ruleShallNotAllow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ShallNotAllow_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleShallNotAllow"
    // InternalBoilerplateText.g:427:1: entryRuleShallNotAllow returns [EObject current=null] : iv_ruleShallNotAllow= ruleShallNotAllow EOF ;
    public final EObject entryRuleShallNotAllow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShallNotAllow = null;


        try {
            // InternalBoilerplateText.g:427:54: (iv_ruleShallNotAllow= ruleShallNotAllow EOF )
            // InternalBoilerplateText.g:428:2: iv_ruleShallNotAllow= ruleShallNotAllow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShallNotAllowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShallNotAllow=ruleShallNotAllow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShallNotAllow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShallNotAllow"


    // $ANTLR start "ruleShallNotAllow"
    // InternalBoilerplateText.g:434:1: ruleShallNotAllow returns [EObject current=null] : (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) ( ( 'allow' )=>otherlv_2= 'allow' ) ( ( (lv_action_3_0= RULE_STRING ) ) | ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleShallNotAllow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_action_3_0=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token lv_actionPerformedByEntity_6_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:440:2: ( (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) ( ( 'allow' )=>otherlv_2= 'allow' ) ( ( (lv_action_3_0= RULE_STRING ) ) | ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) ) ) ) )
            // InternalBoilerplateText.g:441:2: (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) ( ( 'allow' )=>otherlv_2= 'allow' ) ( ( (lv_action_3_0= RULE_STRING ) ) | ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) ) ) )
            {
            // InternalBoilerplateText.g:441:2: (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) ( ( 'allow' )=>otherlv_2= 'allow' ) ( ( (lv_action_3_0= RULE_STRING ) ) | ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) ) ) )
            // InternalBoilerplateText.g:442:3: otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) ( ( 'allow' )=>otherlv_2= 'allow' ) ( ( (lv_action_3_0= RULE_STRING ) ) | ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getShallNotAllowAccess().getShallKeyword_0());
              		
            }
            // InternalBoilerplateText.g:446:3: ( ( 'not' )=>otherlv_1= 'not' )
            // InternalBoilerplateText.g:447:4: ( 'not' )=>otherlv_1= 'not'
            {
            otherlv_1=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getShallNotAllowAccess().getNotKeyword_1());
              			
            }

            }

            // InternalBoilerplateText.g:453:3: ( ( 'allow' )=>otherlv_2= 'allow' )
            // InternalBoilerplateText.g:454:4: ( 'allow' )=>otherlv_2= 'allow'
            {
            otherlv_2=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getShallNotAllowAccess().getAllowKeyword_2());
              			
            }

            }

            // InternalBoilerplateText.g:460:3: ( ( (lv_action_3_0= RULE_STRING ) ) | ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==18) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF) ) {
                    alt5=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBoilerplateText.g:461:4: ( (lv_action_3_0= RULE_STRING ) )
                    {
                    // InternalBoilerplateText.g:461:4: ( (lv_action_3_0= RULE_STRING ) )
                    // InternalBoilerplateText.g:462:5: (lv_action_3_0= RULE_STRING )
                    {
                    // InternalBoilerplateText.g:462:5: (lv_action_3_0= RULE_STRING )
                    // InternalBoilerplateText.g:463:6: lv_action_3_0= RULE_STRING
                    {
                    lv_action_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_action_3_0, grammarAccess.getShallNotAllowAccess().getActionSTRINGTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShallNotAllowRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"action",
                      							lv_action_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:480:4: ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) )
                    {
                    // InternalBoilerplateText.g:480:4: ( ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) ) )
                    // InternalBoilerplateText.g:481:5: ( (lv_entity_4_0= RULE_STRING ) ) otherlv_5= 'to' ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) )
                    {
                    // InternalBoilerplateText.g:481:5: ( (lv_entity_4_0= RULE_STRING ) )
                    // InternalBoilerplateText.g:482:6: (lv_entity_4_0= RULE_STRING )
                    {
                    // InternalBoilerplateText.g:482:6: (lv_entity_4_0= RULE_STRING )
                    // InternalBoilerplateText.g:483:7: lv_entity_4_0= RULE_STRING
                    {
                    lv_entity_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_entity_4_0, grammarAccess.getShallNotAllowAccess().getEntitySTRINGTerminalRuleCall_3_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getShallNotAllowRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"entity",
                      								lv_entity_4_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getShallNotAllowAccess().getToKeyword_3_1_1());
                      				
                    }
                    // InternalBoilerplateText.g:503:5: ( (lv_actionPerformedByEntity_6_0= RULE_STRING ) )
                    // InternalBoilerplateText.g:504:6: (lv_actionPerformedByEntity_6_0= RULE_STRING )
                    {
                    // InternalBoilerplateText.g:504:6: (lv_actionPerformedByEntity_6_0= RULE_STRING )
                    // InternalBoilerplateText.g:505:7: lv_actionPerformedByEntity_6_0= RULE_STRING
                    {
                    lv_actionPerformedByEntity_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_actionPerformedByEntity_6_0, grammarAccess.getShallNotAllowAccess().getActionPerformedByEntitySTRINGTerminalRuleCall_3_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getShallNotAllowRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"actionPerformedByEntity",
                      								lv_actionPerformedByEntity_6_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShallNotAllow"


    // $ANTLR start "entryRuleShallAllow"
    // InternalBoilerplateText.g:527:1: entryRuleShallAllow returns [EObject current=null] : iv_ruleShallAllow= ruleShallAllow EOF ;
    public final EObject entryRuleShallAllow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShallAllow = null;


        try {
            // InternalBoilerplateText.g:527:51: (iv_ruleShallAllow= ruleShallAllow EOF )
            // InternalBoilerplateText.g:528:2: iv_ruleShallAllow= ruleShallAllow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShallAllowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShallAllow=ruleShallAllow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShallAllow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShallAllow"


    // $ANTLR start "ruleShallAllow"
    // InternalBoilerplateText.g:534:1: ruleShallAllow returns [EObject current=null] : (otherlv_0= 'shall' ( ( 'allow' )=>otherlv_1= 'allow' ) ( ( (lv_action_2_0= RULE_STRING ) ) | ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) ) ) ) ;
    public final EObject ruleShallAllow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_action_2_0=null;
        Token lv_entity_3_0=null;
        Token otherlv_4=null;
        Token lv_actionPerformedByEntity_5_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:540:2: ( (otherlv_0= 'shall' ( ( 'allow' )=>otherlv_1= 'allow' ) ( ( (lv_action_2_0= RULE_STRING ) ) | ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) ) ) ) )
            // InternalBoilerplateText.g:541:2: (otherlv_0= 'shall' ( ( 'allow' )=>otherlv_1= 'allow' ) ( ( (lv_action_2_0= RULE_STRING ) ) | ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) ) ) )
            {
            // InternalBoilerplateText.g:541:2: (otherlv_0= 'shall' ( ( 'allow' )=>otherlv_1= 'allow' ) ( ( (lv_action_2_0= RULE_STRING ) ) | ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) ) ) )
            // InternalBoilerplateText.g:542:3: otherlv_0= 'shall' ( ( 'allow' )=>otherlv_1= 'allow' ) ( ( (lv_action_2_0= RULE_STRING ) ) | ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getShallAllowAccess().getShallKeyword_0());
              		
            }
            // InternalBoilerplateText.g:546:3: ( ( 'allow' )=>otherlv_1= 'allow' )
            // InternalBoilerplateText.g:547:4: ( 'allow' )=>otherlv_1= 'allow'
            {
            otherlv_1=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getShallAllowAccess().getAllowKeyword_1());
              			
            }

            }

            // InternalBoilerplateText.g:553:3: ( ( (lv_action_2_0= RULE_STRING ) ) | ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EOF) ) {
                    alt6=1;
                }
                else if ( (LA6_1==18) ) {
                    alt6=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBoilerplateText.g:554:4: ( (lv_action_2_0= RULE_STRING ) )
                    {
                    // InternalBoilerplateText.g:554:4: ( (lv_action_2_0= RULE_STRING ) )
                    // InternalBoilerplateText.g:555:5: (lv_action_2_0= RULE_STRING )
                    {
                    // InternalBoilerplateText.g:555:5: (lv_action_2_0= RULE_STRING )
                    // InternalBoilerplateText.g:556:6: lv_action_2_0= RULE_STRING
                    {
                    lv_action_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_action_2_0, grammarAccess.getShallAllowAccess().getActionSTRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getShallAllowRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"action",
                      							lv_action_2_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBoilerplateText.g:573:4: ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) )
                    {
                    // InternalBoilerplateText.g:573:4: ( ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) ) )
                    // InternalBoilerplateText.g:574:5: ( (lv_entity_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) )
                    {
                    // InternalBoilerplateText.g:574:5: ( (lv_entity_3_0= RULE_STRING ) )
                    // InternalBoilerplateText.g:575:6: (lv_entity_3_0= RULE_STRING )
                    {
                    // InternalBoilerplateText.g:575:6: (lv_entity_3_0= RULE_STRING )
                    // InternalBoilerplateText.g:576:7: lv_entity_3_0= RULE_STRING
                    {
                    lv_entity_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_entity_3_0, grammarAccess.getShallAllowAccess().getEntitySTRINGTerminalRuleCall_2_1_0_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getShallAllowRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"entity",
                      								lv_entity_3_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getShallAllowAccess().getToKeyword_2_1_1());
                      				
                    }
                    // InternalBoilerplateText.g:596:5: ( (lv_actionPerformedByEntity_5_0= RULE_STRING ) )
                    // InternalBoilerplateText.g:597:6: (lv_actionPerformedByEntity_5_0= RULE_STRING )
                    {
                    // InternalBoilerplateText.g:597:6: (lv_actionPerformedByEntity_5_0= RULE_STRING )
                    // InternalBoilerplateText.g:598:7: lv_actionPerformedByEntity_5_0= RULE_STRING
                    {
                    lv_actionPerformedByEntity_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(lv_actionPerformedByEntity_5_0, grammarAccess.getShallAllowAccess().getActionPerformedByEntitySTRINGTerminalRuleCall_2_1_2_0());
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getShallAllowRule());
                      							}
                      							setWithLastConsumed(
                      								current,
                      								"actionPerformedByEntity",
                      								lv_actionPerformedByEntity_5_0,
                      								"org.eclipse.xtext.common.Terminals.STRING");
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShallAllow"


    // $ANTLR start "entryRuleShallNot"
    // InternalBoilerplateText.g:620:1: entryRuleShallNot returns [EObject current=null] : iv_ruleShallNot= ruleShallNot EOF ;
    public final EObject entryRuleShallNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShallNot = null;


        try {
            // InternalBoilerplateText.g:620:49: (iv_ruleShallNot= ruleShallNot EOF )
            // InternalBoilerplateText.g:621:2: iv_ruleShallNot= ruleShallNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShallNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShallNot=ruleShallNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShallNot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShallNot"


    // $ANTLR start "ruleShallNot"
    // InternalBoilerplateText.g:627:1: ruleShallNot returns [EObject current=null] : (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) (otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' ) )? ( (lv_action_5_0= RULE_STRING ) ) ) ;
    public final EObject ruleShallNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_action_5_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:633:2: ( (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) (otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' ) )? ( (lv_action_5_0= RULE_STRING ) ) ) )
            // InternalBoilerplateText.g:634:2: (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) (otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' ) )? ( (lv_action_5_0= RULE_STRING ) ) )
            {
            // InternalBoilerplateText.g:634:2: (otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) (otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' ) )? ( (lv_action_5_0= RULE_STRING ) ) )
            // InternalBoilerplateText.g:635:3: otherlv_0= 'shall' ( ( 'not' )=>otherlv_1= 'not' ) (otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' ) )? ( (lv_action_5_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getShallNotAccess().getShallKeyword_0());
              		
            }
            // InternalBoilerplateText.g:639:3: ( ( 'not' )=>otherlv_1= 'not' )
            // InternalBoilerplateText.g:640:4: ( 'not' )=>otherlv_1= 'not'
            {
            otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getShallNotAccess().getNotKeyword_1());
              			
            }

            }

            // InternalBoilerplateText.g:646:3: (otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBoilerplateText.g:647:4: otherlv_2= 'be' ( ( 'able' )=>otherlv_3= 'able' ) ( ( 'to' )=>otherlv_4= 'to' )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getShallNotAccess().getBeKeyword_2_0());
                      			
                    }
                    // InternalBoilerplateText.g:651:4: ( ( 'able' )=>otherlv_3= 'able' )
                    // InternalBoilerplateText.g:652:5: ( 'able' )=>otherlv_3= 'able'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getShallNotAccess().getAbleKeyword_2_1());
                      				
                    }

                    }

                    // InternalBoilerplateText.g:658:4: ( ( 'to' )=>otherlv_4= 'to' )
                    // InternalBoilerplateText.g:659:5: ( 'to' )=>otherlv_4= 'to'
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getShallNotAccess().getToKeyword_2_2());
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalBoilerplateText.g:666:3: ( (lv_action_5_0= RULE_STRING ) )
            // InternalBoilerplateText.g:667:4: (lv_action_5_0= RULE_STRING )
            {
            // InternalBoilerplateText.g:667:4: (lv_action_5_0= RULE_STRING )
            // InternalBoilerplateText.g:668:5: lv_action_5_0= RULE_STRING
            {
            lv_action_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_action_5_0, grammarAccess.getShallNotAccess().getActionSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getShallNotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"action",
              						lv_action_5_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShallNot"


    // $ANTLR start "entryRuleShall"
    // InternalBoilerplateText.g:688:1: entryRuleShall returns [EObject current=null] : iv_ruleShall= ruleShall EOF ;
    public final EObject entryRuleShall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShall = null;


        try {
            // InternalBoilerplateText.g:688:46: (iv_ruleShall= ruleShall EOF )
            // InternalBoilerplateText.g:689:2: iv_ruleShall= ruleShall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleShall=ruleShall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShall"


    // $ANTLR start "ruleShall"
    // InternalBoilerplateText.g:695:1: ruleShall returns [EObject current=null] : (otherlv_0= 'shall' ( ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) ) )? ( (lv_action_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleShall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_action_4_0=null;


        	enterRule();

        try {
            // InternalBoilerplateText.g:701:2: ( (otherlv_0= 'shall' ( ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) ) )? ( (lv_action_4_0= RULE_STRING ) ) ) )
            // InternalBoilerplateText.g:702:2: (otherlv_0= 'shall' ( ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) ) )? ( (lv_action_4_0= RULE_STRING ) ) )
            {
            // InternalBoilerplateText.g:702:2: (otherlv_0= 'shall' ( ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) ) )? ( (lv_action_4_0= RULE_STRING ) ) )
            // InternalBoilerplateText.g:703:3: otherlv_0= 'shall' ( ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) ) )? ( (lv_action_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getShallAccess().getShallKeyword_0());
              		
            }
            // InternalBoilerplateText.g:707:3: ( ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) && (synpred7_InternalBoilerplateText())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBoilerplateText.g:708:4: ( 'be' )=> (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) )
                    {
                    // InternalBoilerplateText.g:709:4: (otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' ) )
                    // InternalBoilerplateText.g:710:5: otherlv_1= 'be' ( ( 'able' )=>otherlv_2= 'able' ) ( ( 'to' )=>otherlv_3= 'to' )
                    {
                    otherlv_1=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getShallAccess().getBeKeyword_1_0_0());
                      				
                    }
                    // InternalBoilerplateText.g:714:5: ( ( 'able' )=>otherlv_2= 'able' )
                    // InternalBoilerplateText.g:715:6: ( 'able' )=>otherlv_2= 'able'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getShallAccess().getAbleKeyword_1_0_1());
                      					
                    }

                    }

                    // InternalBoilerplateText.g:721:5: ( ( 'to' )=>otherlv_3= 'to' )
                    // InternalBoilerplateText.g:722:6: ( 'to' )=>otherlv_3= 'to'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getShallAccess().getToKeyword_1_0_2());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalBoilerplateText.g:730:3: ( (lv_action_4_0= RULE_STRING ) )
            // InternalBoilerplateText.g:731:4: (lv_action_4_0= RULE_STRING )
            {
            // InternalBoilerplateText.g:731:4: (lv_action_4_0= RULE_STRING )
            // InternalBoilerplateText.g:732:5: lv_action_4_0= RULE_STRING
            {
            lv_action_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_action_4_0, grammarAccess.getShallAccess().getActionSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getShallRule());
              					}
              					setWithLastConsumed(
              						current,
              						"action",
              						lv_action_4_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShall"

    // $ANTLR start synpred7_InternalBoilerplateText
    public final void synpred7_InternalBoilerplateText_fragment() throws RecognitionException {   
        // InternalBoilerplateText.g:708:4: ( 'be' )
        // InternalBoilerplateText.g:708:5: 'be'
        {
        match(input,19,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalBoilerplateText

    // Delegated rules

    public final boolean synpred7_InternalBoilerplateText() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalBoilerplateText_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}