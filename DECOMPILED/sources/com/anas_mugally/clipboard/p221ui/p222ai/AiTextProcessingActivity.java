package com.anas_mugally.clipboard.p221ui.p222ai;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.DialogInterfaceC2241b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.AbstractC2473f;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import androidx.lifecycle.AbstractC2658t;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.AbstractC3081u;
import com.anas_mugally.clipboard.ActionsLayout;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.database.AppDatabase;
import com.anas_mugally.clipboard.p221ui.WatchAdActivity;
import com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a;
import com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity;
import com.anas_mugally.clipboard.p221ui.notes.AbstractViewOnClickListenerC3141a;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.models.ProcessingResultData;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3137d;
import com.anas_mugally.clipboard.service.MyAccessibilityService;
import com.android.billingclient.api.Purchase;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.FirebaseAuth;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.InterfaceC6113i;
import p033E.C0247b;
import p111O.AbstractC1030Z;
import p111O.AbstractC1061m0;
import p111O.C0982A0;
import p111O.InterfaceC0993G;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1437o;
import p145S5.C1434l;
import p145S5.C1444v;
import p145S5.InterfaceC1425c;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1617O;
import p152T5.AbstractC1638q;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p223d.AbstractC5158A;
import p223d.AbstractC5166I;
import p233e1.AbstractC5291e;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p247g.C5449c;
import p281k1.C5920K;
import p302m6.AbstractC6406h;
import p318o6.AbstractC6672k;
import p318o6.InterfaceC6624N;
import p347s1.C6946B;
import p347s1.C6951G;
import p347s1.C6963T;
import p347s1.C6967X;
import p347s1.C6971a0;
import p347s1.C6983g0;
import p355t1.AbstractC7071b;
import p363u1.C7154a;
import p379w1.AbstractC7305Z;
import p405z3.C7611b;

/* JADX INFO: loaded from: classes.dex */
public final class AiTextProcessingActivity extends BaseMyAppAdsActivity {

    /* JADX INFO: renamed from: V0 */
    public static final C3131a f13087V0 = new C3131a(null);

    /* JADX INFO: renamed from: M0 */
    private ProcessingResultData f13089M0;

    /* JADX INFO: renamed from: N0 */
    private String f13090N0;

    /* JADX INFO: renamed from: O0 */
    private AbstractC5291e f13091O0;

    /* JADX INFO: renamed from: P0 */
    private C7154a f13092P0;

    /* JADX INFO: renamed from: Q0 */
    private FirebaseAuth f13093Q0;

    /* JADX INFO: renamed from: S0 */
    private AiPrompt f13095S0;

    /* JADX INFO: renamed from: T0 */
    private String f13096T0;

    /* JADX INFO: renamed from: L0 */
    private final InterfaceC1429g f13088L0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: q1.o
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return AiTextProcessingActivity.m16302I4(this.f27392a);
        }
    });

    /* JADX INFO: renamed from: R0 */
    private AbstractC5382c f13094R0 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: q1.p
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            AiTextProcessingActivity.m16324d5(this.f27393a, (C5380a) obj);
        }
    });

    /* JADX INFO: renamed from: U0 */
    private final AbstractC5382c f13097U0 = m23988A0(new C5449c(), new InterfaceC5381b() { // from class: q1.q
        @Override // p239f.InterfaceC5381b
        /* JADX INFO: renamed from: a */
        public final void mo12412a(Object obj) {
            AiTextProcessingActivity.m16307L5(this.f27394a, (C5380a) obj);
        }
    });

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity$a */
    public static final class C3131a {
        public /* synthetic */ C3131a(AbstractC6112h abstractC6112h) {
            this();
        }

        private C3131a() {
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity$b */
    static final class C3132b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f13098a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ AiPrompt f13100c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f13101d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3132b(AiPrompt aiPrompt, String str, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f13100c = aiPrompt;
            this.f13101d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            return AiTextProcessingActivity.this.new C3132b(this.f13100c, this.f13101d, interfaceC1875e);
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((C3132b) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            AbstractC2005b.m8369e();
            if (this.f13098a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1437o.m6082b(obj);
            C7154a c7154a = AiTextProcessingActivity.this.f13092P0;
            if (c7154a == null) {
                AbstractC6118n.m27197o("viewModel");
                c7154a = null;
            }
            AiTextProcessingActivity aiTextProcessingActivity = AiTextProcessingActivity.this;
            String strM16310O4 = aiTextProcessingActivity.m16310O4();
            AiPrompt aiPrompt = this.f13100c;
            String strM15842S1 = AiTextProcessingActivity.this.m15842S1();
            String str = this.f13101d;
            String strM16313R4 = AiTextProcessingActivity.this.m16313R4();
            AbstractC6118n.m27184b(strM16313R4);
            c7154a.m31644k(aiTextProcessingActivity, strM16310O4, aiPrompt, strM15842S1, str, strM16313R4);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity$c */
    static final class C3133c implements InterfaceC2612D, InterfaceC6113i {

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC5367l f13102a;

        C3133c(InterfaceC5367l function) {
            AbstractC6118n.m27187e(function, "function");
            this.f13102a = function;
        }

        @Override // kotlin.jvm.internal.InterfaceC6113i
        /* JADX INFO: renamed from: a */
        public final InterfaceC1425c mo12586a() {
            return this.f13102a;
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo12097b(Object obj) {
            this.f13102a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC2612D) && (obj instanceof InterfaceC6113i)) {
                return AbstractC6118n.m27183a(mo12586a(), ((InterfaceC6113i) obj).mo12586a());
            }
            return false;
        }

        public final int hashCode() {
            return mo12586a().hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A5 */
    public static final C1444v m16290A5(AiTextProcessingActivity aiTextProcessingActivity, String text) {
        AbstractC6118n.m27187e(text, "text");
        aiTextProcessingActivity.f13090N0 = text;
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B5 */
    public static final boolean m16292B5(final AiTextProcessingActivity aiTextProcessingActivity, final ProcessingResultData processingResultData, final MenuItem it) {
        AbstractC6118n.m27187e(it, "it");
        aiTextProcessingActivity.m16261j3(new InterfaceC5356a() { // from class: q1.m
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return AiTextProcessingActivity.m16294C5(this.f27388a, it, processingResultData);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C5 */
    public static final C1444v m16294C5(AiTextProcessingActivity aiTextProcessingActivity, MenuItem menuItem, ProcessingResultData processingResultData) {
        int itemId = menuItem.getItemId();
        String text = aiTextProcessingActivity.f13090N0;
        if (text == null) {
            text = processingResultData.getText();
        }
        aiTextProcessingActivity.m16316U4(itemId, text);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public static final C1444v m16296D5(AiTextProcessingActivity aiTextProcessingActivity, ProcessingResultData processingResultData, ComponentName componentName, ActionsLayout.EnumC3037c type) {
        AbstractC6118n.m27187e(type, "type");
        String text = aiTextProcessingActivity.f13090N0;
        if (text == null) {
            text = processingResultData.getText();
        }
        AbstractC3041D.m15090o(aiTextProcessingActivity, text, componentName, type, false, 8, null);
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: G4 */
    private final boolean m16298G4() {
        if (!m15845V1() || m16305K4() > 0) {
            return true;
        }
        m16304J5();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G5 */
    public static final void m16299G5(AiTextProcessingActivity aiTextProcessingActivity, TextInputEditText textInputEditText, DialogInterface dialogInterface, int i7) {
        AbstractC5291e abstractC5291e = aiTextProcessingActivity.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        TextInputEditText textInputEditText2 = abstractC5291e.f20196A;
        Editable text = textInputEditText.getText();
        String string = text != null ? text.toString() : null;
        if (string == null) {
            string = "";
        }
        textInputEditText2.setText(string);
        dialogInterface.dismiss();
    }

    /* JADX INFO: renamed from: H4 */
    private final boolean m16300H4() {
        FirebaseAuth firebaseAuth = this.f13093Q0;
        AbstractC5291e abstractC5291e = null;
        if (firebaseAuth == null) {
            AbstractC6118n.m27197o("auth");
            firebaseAuth = null;
        }
        if (firebaseAuth.m21989e() == null) {
            m16355u5();
            return false;
        }
        if (m16310O4().length() == 0) {
            AbstractC5291e abstractC5291e2 = this.f13091O0;
            if (abstractC5291e2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e = abstractC5291e2;
            }
            abstractC5291e.f20199D.setError(getString(R.string.this_field_can_not_be_empty));
            return false;
        }
        if (m16310O4().length() > m16309N4()) {
            AbstractC5291e abstractC5291e3 = this.f13091O0;
            if (abstractC5291e3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e = abstractC5291e3;
            }
            abstractC5291e.f20199D.setError(getString(R.string.topic_too_long, String.valueOf(m16309N4())));
            return false;
        }
        AbstractC5291e abstractC5291e4 = this.f13091O0;
        if (abstractC5291e4 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e4 = null;
        }
        abstractC5291e4.f20199D.setError(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H5 */
    public static final void m16301H5(DialogInterface dialogInterface, int i7) {
        dialogInterface.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final SharedPreferences m16302I4(AiTextProcessingActivity aiTextProcessingActivity) {
        return aiTextProcessingActivity.getSharedPreferences("OneDayShared", 0);
    }

    /* JADX INFO: renamed from: J4 */
    private final SharedPreferences m16303J4() {
        return (SharedPreferences) this.f13088L0.getValue();
    }

    /* JADX INFO: renamed from: J5 */
    private final void m16304J5() {
        WatchAdActivity.C3108a c3108a = WatchAdActivity.f12879J0;
        String string = getString(R.string.watch_ad_ai_reward);
        AbstractC6118n.m27186d(string, "getString(...)");
        AbstractActivityC3130a.e eVar = AbstractActivityC3130a.f13021g0;
        this.f13097U0.m24394a(c3108a.m15790a(this, string, eVar.m16267a(), eVar.m16268b(), eVar.m16269c()));
    }

    /* JADX INFO: renamed from: K4 */
    private final int m16305K4() {
        int i7 = m16303J4().getInt(m16312Q4("countOfUsingAi_"), 4);
        if (i7 == 4) {
            Map<String, ?> all = m16303J4().getAll();
            AbstractC6118n.m27186d(all, "getAll(...)");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                AbstractC6118n.m27186d(key, "<get-key>(...)");
                if (AbstractC6406h.m27589Q(key, "countOfUsingAi_", false, 2, null)) {
                    SharedPreferences sharedPreferencesM16303J4 = m16303J4();
                    AbstractC6118n.m27186d(sharedPreferencesM16303J4, "<get-countDayShared>(...)");
                    SharedPreferences.Editor editorEdit = sharedPreferencesM16303J4.edit();
                    editorEdit.remove(entry.getKey());
                    editorEdit.commit();
                }
            }
        }
        return i7;
    }

    /* JADX INFO: renamed from: L4 */
    private final AbstractC4880u m16306L4() {
        FirebaseAuth firebaseAuth = this.f13093Q0;
        if (firebaseAuth == null) {
            AbstractC6118n.m27197o("auth");
            firebaseAuth = null;
        }
        return firebaseAuth.m21989e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L5 */
    public static final void m16307L5(AiTextProcessingActivity aiTextProcessingActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        int iM24390b = result.m24390b();
        if (iM24390b != 100) {
            if (iM24390b != 101) {
                return;
            }
            View view = new View(aiTextProcessingActivity.getApplication());
            view.setId(R.id.in_app_purchasing);
            aiTextProcessingActivity.onClick(view);
            return;
        }
        Intent intentM24389a = result.m24389a();
        if (intentM24389a != null) {
            aiTextProcessingActivity.m16327g5(intentM24389a.getIntExtra("reward_amount", 1));
            Log.d("anas_count", String.valueOf(aiTextProcessingActivity.m16305K4()));
            Toast.makeText(aiTextProcessingActivity, R.string.you_can_use_ai_feature_now, 0).show();
        }
    }

    /* JADX INFO: renamed from: M4 */
    private final boolean m16308M4() {
        return getIntent().getBooleanExtra(AbstractViewOnClickListenerC3141a.f13140d1.m16596c(), false);
    }

    /* JADX INFO: renamed from: N4 */
    private final int m16309N4() {
        return m15845V1() ? 2000 : 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public final String m16310O4() {
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        return String.valueOf(abstractC5291e.f20196A.getText());
    }

    /* JADX INFO: renamed from: P4 */
    private final CharSequence m16311P4() {
        try {
            Object systemService = getSystemService("clipboard");
            AbstractC6118n.m27185c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
            ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
            ClipData.Item itemAt = primaryClip != null ? primaryClip.getItemAt(0) : null;
            if (itemAt != null) {
                return itemAt.getText();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: Q4 */
    private final String m16312Q4(String str) {
        return str + new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public final String m16313R4() {
        String string = m16303J4().getString(m16312Q4("todayUid_"), null);
        if (string == null) {
            Map<String, ?> all = m16303J4().getAll();
            AbstractC6118n.m27186d(all, "getAll(...)");
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                AbstractC6118n.m27186d(key, "<get-key>(...)");
                if (AbstractC6406h.m27589Q(key, "todayUid_", false, 2, null)) {
                    SharedPreferences sharedPreferencesM16303J4 = m16303J4();
                    AbstractC6118n.m27186d(sharedPreferencesM16303J4, "<get-countDayShared>(...)");
                    SharedPreferences.Editor editorEdit = sharedPreferencesM16303J4.edit();
                    editorEdit.remove(entry.getKey());
                    editorEdit.commit();
                }
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: S4 */
    private final void m16314S4() {
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        abstractC5291e.f20196A.postDelayed(new Runnable() { // from class: q1.e
            @Override // java.lang.Runnable
            public final void run() {
                AiTextProcessingActivity.m16315T4(this.f27376a);
            }
        }, 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public static final void m16315T4(AiTextProcessingActivity aiTextProcessingActivity) {
        String string;
        String string2;
        CharSequence stringExtra = aiTextProcessingActivity.getIntent().getStringExtra("android.intent.extra.TEXT");
        AbstractC5291e abstractC5291e = null;
        if (stringExtra == null && (stringExtra = aiTextProcessingActivity.getIntent().getStringExtra("android.intent.extra.PROCESS_TEXT")) == null) {
            MyAccessibilityService myAccessibilityServiceM15245a = MyAccessibilityService.f12639O.m15245a();
            stringExtra = myAccessibilityServiceM15245a != null ? myAccessibilityServiceM15245a.m15243x() : null;
            if (stringExtra == null) {
                stringExtra = aiTextProcessingActivity.m16311P4();
            }
        }
        if (stringExtra == null || (string = stringExtra.toString()) == null || (string2 = AbstractC6406h.m27594S0(string).toString()) == null) {
            return;
        }
        AbstractC5291e abstractC5291e2 = aiTextProcessingActivity.f13091O0;
        if (abstractC5291e2 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5291e = abstractC5291e2;
        }
        abstractC5291e.f20196A.setText(string2);
    }

    /* JADX INFO: renamed from: U4 */
    private final void m16316U4(int i7, String str) {
        AbstractC5291e abstractC5291e = null;
        if (i7 == R.id.original_text) {
            new C7611b(this).m33365P(R.string.original_text).mo9105i(m16310O4()).m33356G(R.string.cancel, null).m33361L(R.string.copy, new DialogInterface.OnClickListener() { // from class: q1.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    AiTextProcessingActivity.m16317V4(this.f27391a, dialogInterface, i8);
                }
            }).m9118v();
        } else {
            C5920K c5920k = new C5920K(this, str, false);
            AbstractC5291e abstractC5291e2 = this.f13091O0;
            if (abstractC5291e2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e = abstractC5291e2;
            }
            ImageButton imageButton = abstractC5291e.f20203v.getItemViewMap().get(Integer.valueOf(i7));
            AbstractC6118n.m27184b(imageButton);
            c5920k.m26717s(imageButton, AppDatabase.f12597p.m15148b(this));
            c5920k.m26716i(i7);
        }
        if (i7 == R.id.original_text || i7 == R.id.save) {
            return;
        }
        if (i7 == R.id.send_text) {
            Application application = getApplication();
            AbstractC6118n.m27186d(application, "getApplication(...)");
            if (!AbstractC3081u.m15315b(application)) {
                return;
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public static final void m16317V4(AiTextProcessingActivity aiTextProcessingActivity, DialogInterface dialogInterface, int i7) {
        C3034A.f12453a.m15029c(aiTextProcessingActivity, aiTextProcessingActivity.m16310O4());
    }

    /* JADX INFO: renamed from: W4 */
    private final boolean m16318W4() {
        return isInMultiWindowMode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX INFO: renamed from: X4 */
    public static final C1444v m16319X4(AiTextProcessingActivity aiTextProcessingActivity, AbstractC5158A addCallback) {
        AbstractC6118n.m27187e(addCallback, "$this$addCallback");
        List listM12401u0 = aiTextProcessingActivity.m12232H0().m12401u0();
        AbstractC6118n.m27186d(listM12401u0, "getFragments(...)");
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591i = (AbstractComponentCallbacksC2591i) AbstractC1638q.m6580T(listM12401u0);
        boolean z7 = abstractComponentCallbacksC2591i instanceof C6951G;
        AbstractC5291e abstractC5291e = null;
        if (z7 || (abstractComponentCallbacksC2591i instanceof C6967X) || (abstractComponentCallbacksC2591i instanceof C6983g0) || (abstractComponentCallbacksC2591i instanceof C6963T)) {
            if (z7) {
                AbstractC5291e abstractC5291e2 = aiTextProcessingActivity.f13091O0;
                if (abstractC5291e2 == null) {
                    AbstractC6118n.m27197o("binding");
                    abstractC5291e2 = null;
                }
                ConstraintLayout appbar = abstractC5291e2.f20204w;
                AbstractC6118n.m27186d(appbar, "appbar");
                appbar.setVisibility(8);
                aiTextProcessingActivity.f13089M0 = null;
            }
            aiTextProcessingActivity.m16372y5(C6946B.f27900t0.m30486a(aiTextProcessingActivity.m16310O4()), "fragment_options");
            AbstractC5291e abstractC5291e3 = aiTextProcessingActivity.f13091O0;
            if (abstractC5291e3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e = abstractC5291e3;
            }
            TextInputLayout layInputText = abstractC5291e.f20199D;
            AbstractC6118n.m27186d(layInputText, "layInputText");
            layInputText.setVisibility(0);
        } else if (!(abstractComponentCallbacksC2591i instanceof C6971a0) && Build.VERSION.SDK_INT >= 28) {
            AbstractC5291e abstractC5291e4 = aiTextProcessingActivity.f13091O0;
            if (abstractC5291e4 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5291e4 = null;
            }
            if (abstractC5291e4.f20196A.isFocused()) {
                AbstractC5291e abstractC5291e5 = aiTextProcessingActivity.f13091O0;
                if (abstractC5291e5 == null) {
                    AbstractC6118n.m27197o("binding");
                } else {
                    abstractC5291e = abstractC5291e5;
                }
                abstractC5291e.f20196A.clearFocus();
            } else {
                addCallback.m23915j(false);
                aiTextProcessingActivity.finishAndRemoveTask();
            }
        } else {
            addCallback.m23915j(false);
            aiTextProcessingActivity.finishAndRemoveTask();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public static final void m16320Y4(AiTextProcessingActivity aiTextProcessingActivity, boolean z7) {
        if (z7) {
            return;
        }
        AbstractC5291e abstractC5291e = aiTextProcessingActivity.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        FrameLayout layAd = abstractC5291e.f20197B;
        AbstractC6118n.m27186d(layAd, "layAd");
        BaseMyAppAdsActivity.m16158V3(aiTextProcessingActivity, layAd, R.layout.myapp_naitve_small_support_light, null, 4, null);
    }

    /* JADX INFO: renamed from: Z4 */
    private final void m16321Z4(AiPrompt aiPrompt, String str) {
        m16372y5(new C6951G(), "fragment_processing");
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        ConstraintLayout appbar = abstractC5291e.f20204w;
        AbstractC6118n.m27186d(appbar, "appbar");
        appbar.setVisibility(8);
        AbstractC5291e abstractC5291e2 = this.f13091O0;
        if (abstractC5291e2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e2 = null;
        }
        TextInputLayout layInputText = abstractC5291e2.f20199D;
        AbstractC6118n.m27186d(layInputText, "layInputText");
        layInputText.setVisibility(8);
        AbstractC6672k.m28227d(AbstractC2658t.m12641a(this), null, null, new C3132b(aiPrompt, str, null), 3, null);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m16322b5(AiTextProcessingActivity aiTextProcessingActivity, AiPrompt aiPrompt, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        aiTextProcessingActivity.m16369a5(aiPrompt, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c5 */
    public static final C1444v m16323c5(AiTextProcessingActivity aiTextProcessingActivity, AiPrompt aiPrompt, String str) {
        aiTextProcessingActivity.m16321Z4(aiPrompt, str);
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final void m16324d5(AiTextProcessingActivity aiTextProcessingActivity, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        if (result.m24390b() == 2001) {
            aiTextProcessingActivity.m16355u5();
        }
    }

    /* JADX INFO: renamed from: e5 */
    private final void m16325e5(Bundle bundle) {
        Serializable serializable = bundle.getSerializable("resultData");
        AbstractC5291e abstractC5291e = null;
        this.f13089M0 = serializable instanceof ProcessingResultData ? (ProcessingResultData) serializable : null;
        AbstractC5291e abstractC5291e2 = this.f13091O0;
        if (abstractC5291e2 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5291e = abstractC5291e2;
        }
        abstractC5291e.f20196A.setText(bundle.getString("originalText", ""));
    }

    /* JADX INFO: renamed from: g5 */
    private final void m16327g5(int i7) {
        SharedPreferences sharedPreferencesM16303J4 = m16303J4();
        AbstractC6118n.m27186d(sharedPreferencesM16303J4, "<get-countDayShared>(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesM16303J4.edit();
        editorEdit.putInt(m16312Q4("countOfUsingAi_"), i7);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: h5 */
    private final void m16329h5() {
        if (m16318W4()) {
            return;
        }
        AbstractC1061m0.m4703b(getWindow(), false);
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        AbstractC1030Z.m4494t0(abstractC5291e.m10849k(), new InterfaceC0993G() { // from class: q1.b
            @Override // p111O.InterfaceC0993G
            /* JADX INFO: renamed from: a */
            public final C0982A0 mo4369a(View view, C0982A0 c0982a0) {
                return AiTextProcessingActivity.m16331i5(this.f27373a, view, c0982a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i5 */
    public static final C0982A0 m16331i5(AiTextProcessingActivity aiTextProcessingActivity, View view, C0982A0 windowInsets) {
        AbstractC6118n.m27187e(view, "view");
        AbstractC6118n.m27187e(windowInsets, "windowInsets");
        C0247b c0247bM4272f = windowInsets.m4272f(C0982A0.p.m4332e());
        AbstractC6118n.m27186d(c0247bM4272f, "getInsets(...)");
        AbstractC5291e abstractC5291e = aiTextProcessingActivity.f13091O0;
        AbstractC5291e abstractC5291e2 = null;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        LinearLayout layChild = abstractC5291e.f20198C;
        AbstractC6118n.m27186d(layChild, "layChild");
        layChild.setPadding(layChild.getPaddingLeft(), layChild.getPaddingTop(), layChild.getPaddingRight(), c0247bM4272f.f987d);
        AbstractC5291e abstractC5291e3 = aiTextProcessingActivity.f13091O0;
        if (abstractC5291e3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e3 = null;
        }
        ConstraintLayout layParent = abstractC5291e3.f20200E;
        AbstractC6118n.m27186d(layParent, "layParent");
        layParent.setPadding(layParent.getPaddingLeft(), c0247bM4272f.f985b, layParent.getPaddingRight(), layParent.getPaddingBottom());
        if (C3034A.f12453a.m15018E(aiTextProcessingActivity)) {
            AbstractC5291e abstractC5291e4 = aiTextProcessingActivity.f13091O0;
            if (abstractC5291e4 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e2 = abstractC5291e4;
            }
            LinearLayout layChild2 = abstractC5291e2.f20198C;
            AbstractC6118n.m27186d(layChild2, "layChild");
            layChild2.setPadding(layChild2.getPaddingLeft(), layChild2.getPaddingTop(), c0247bM4272f.f986c, layChild2.getPaddingBottom());
        }
        return C0982A0.f3748b;
    }

    /* JADX INFO: renamed from: j5 */
    private final void m16333j5(String str) {
        SharedPreferences sharedPreferencesM16303J4 = m16303J4();
        AbstractC6118n.m27186d(sharedPreferencesM16303J4, "<get-countDayShared>(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesM16303J4.edit();
        editorEdit.putString(m16312Q4("todayUid_"), str);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: k5 */
    private final void m16335k5() {
        C7154a c7154a = this.f13092P0;
        C7154a c7154a2 = null;
        if (c7154a == null) {
            AbstractC6118n.m27197o("viewModel");
            c7154a = null;
        }
        c7154a.m31643j().m12674k(this, new C3133c(new InterfaceC5367l() { // from class: q1.c
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AiTextProcessingActivity.m16337l5(this.f27374a, (AbstractC7071b) obj);
            }
        }));
        C7154a c7154a3 = this.f13092P0;
        if (c7154a3 == null) {
            AbstractC6118n.m27197o("viewModel");
        } else {
            c7154a2 = c7154a3;
        }
        c7154a2.m31642i().m12674k(this, new C3133c(new InterfaceC5367l() { // from class: q1.d
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AiTextProcessingActivity.m16339m5(this.f27375a, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public static final C1444v m16337l5(AiTextProcessingActivity aiTextProcessingActivity, AbstractC7071b abstractC7071b) {
        if (!(abstractC7071b instanceof AbstractC7071b.b)) {
            if (abstractC7071b instanceof AbstractC7071b.c) {
                AbstractC7071b.c cVar = (AbstractC7071b.c) abstractC7071b;
                aiTextProcessingActivity.f13089M0 = cVar.m31179a();
                aiTextProcessingActivity.m16363z5(cVar.m31179a());
            } else {
                if (!(abstractC7071b instanceof AbstractC7071b.a)) {
                    throw new C1434l();
                }
                aiTextProcessingActivity.m16360x5((AbstractC7071b.a) abstractC7071b);
            }
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public static final C1444v m16339m5(AiTextProcessingActivity aiTextProcessingActivity, Boolean bool) {
        if (bool.booleanValue()) {
            aiTextProcessingActivity.m16355u5();
            C7154a c7154a = aiTextProcessingActivity.f13092P0;
            if (c7154a == null) {
                AbstractC6118n.m27197o("viewModel");
                c7154a = null;
            }
            c7154a.m31641h();
        }
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: n5 */
    private final void m16341n5() {
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        abstractC5291e.f20198C.setBackground(new C3137d(this, true).m16407d());
        AbstractC5291e abstractC5291e2 = this.f13091O0;
        if (abstractC5291e2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e2 = null;
        }
        abstractC5291e2.f20205x.setOnClickListener(new View.OnClickListener() { // from class: q1.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiTextProcessingActivity.m16343o5(this.f27395a, view);
            }
        });
        abstractC5291e.f20200E.setOnClickListener(new View.OnClickListener() { // from class: q1.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiTextProcessingActivity.m16345p5(this.f27396a, view);
            }
        });
        abstractC5291e.f20198C.setOnClickListener(null);
        abstractC5291e.f20204w.setVisibility(8);
        if (getResources().getConfiguration().orientation == 2) {
            abstractC5291e.f20196A.setMaxLines(2);
        }
        abstractC5291e.f20199D.setOnClickListener(new View.OnClickListener() { // from class: q1.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiTextProcessingActivity.m16347q5(this.f27397a, view);
            }
        });
        abstractC5291e.f20196A.setOnClickListener(new View.OnClickListener() { // from class: q1.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiTextProcessingActivity.m16349r5(this.f27398a, view);
            }
        });
        ImageView imgOpenApp = abstractC5291e.f20207z;
        AbstractC6118n.m27186d(imgOpenApp, "imgOpenApp");
        imgOpenApp.setVisibility(m16308M4() ? 8 : 0);
        abstractC5291e.f20207z.setOnClickListener(new View.OnClickListener() { // from class: q1.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AiTextProcessingActivity.m16351s5(this.f27399a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o5 */
    public static final void m16343o5(AiTextProcessingActivity aiTextProcessingActivity, View view) {
        aiTextProcessingActivity.mo12238b().m23939s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public static final void m16345p5(AiTextProcessingActivity aiTextProcessingActivity, View view) {
        List listM12401u0 = aiTextProcessingActivity.m12232H0().m12401u0();
        AbstractC6118n.m27186d(listM12401u0, "getFragments(...)");
        if (AbstractC1638q.m6580T(listM12401u0) instanceof C6951G) {
            return;
        }
        aiTextProcessingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public static final void m16347q5(AiTextProcessingActivity aiTextProcessingActivity, View view) {
        aiTextProcessingActivity.m16366F5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r5 */
    public static final void m16349r5(AiTextProcessingActivity aiTextProcessingActivity, View view) {
        aiTextProcessingActivity.m16366F5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public static final void m16351s5(AiTextProcessingActivity aiTextProcessingActivity, View view) {
        AbstractC7305Z.m32303a(aiTextProcessingActivity);
        aiTextProcessingActivity.finishAndRemoveTask();
    }

    /* JADX INFO: renamed from: t5 */
    private final void m16353t5() {
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
    }

    /* JADX INFO: renamed from: u5 */
    private final void m16355u5() {
        m16372y5(C6971a0.f27969s0.m30566a(m16310O4()), "fragment_auth");
        AbstractC5291e abstractC5291e = this.f13091O0;
        AbstractC5291e abstractC5291e2 = null;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        TextInputLayout layInputText = abstractC5291e.f20199D;
        AbstractC6118n.m27186d(layInputText, "layInputText");
        layInputText.setVisibility(8);
        AbstractC5291e abstractC5291e3 = this.f13091O0;
        if (abstractC5291e3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5291e2 = abstractC5291e3;
        }
        ConstraintLayout appbar = abstractC5291e2.f20204w;
        AbstractC6118n.m27186d(appbar, "appbar");
        appbar.setVisibility(8);
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m16358w5(AiTextProcessingActivity aiTextProcessingActivity, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        aiTextProcessingActivity.m16371v5(str);
    }

    /* JADX INFO: renamed from: x5 */
    private final void m16360x5(AbstractC7071b.a aVar) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12379h0 = m12232H0().m12379h0("fragment_processing");
        C6951G c6951g = abstractComponentCallbacksC2591iM12379h0 instanceof C6951G ? (C6951G) abstractComponentCallbacksC2591iM12379h0 : null;
        if (c6951g != null) {
            c6951g.m30501b2(aVar);
        }
    }

    /* JADX INFO: renamed from: z5 */
    private final void m16363z5(final ProcessingResultData processingResultData) {
        AbstractComponentCallbacksC2591i abstractComponentCallbacksC2591iM12379h0 = m12232H0().m12379h0("fragment_processing");
        AbstractC5291e abstractC5291e = null;
        C6951G c6951g = abstractComponentCallbacksC2591iM12379h0 instanceof C6951G ? (C6951G) abstractComponentCallbacksC2591iM12379h0 : null;
        m16327g5(m16305K4() - 1);
        if (c6951g == null || !c6951g.m12188n0()) {
            return;
        }
        c6951g.m30502d2(processingResultData, new InterfaceC5367l() { // from class: q1.i
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AiTextProcessingActivity.m16290A5(this.f27382a, (String) obj);
            }
        });
        AbstractC5291e abstractC5291e2 = this.f13091O0;
        if (abstractC5291e2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e2 = null;
        }
        abstractC5291e2.f20203v.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: q1.j
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return AiTextProcessingActivity.m16292B5(this.f27383a, processingResultData, menuItem);
            }
        });
        AbstractC5291e abstractC5291e3 = this.f13091O0;
        if (abstractC5291e3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e3 = null;
        }
        abstractC5291e3.f20203v.setOnMoreAppsItemClickListener(new InterfaceC5371p() { // from class: q1.k
            @Override // p238e6.InterfaceC5371p
            public final Object invoke(Object obj, Object obj2) {
                return AiTextProcessingActivity.m16296D5(this.f27385a, processingResultData, (ComponentName) obj, (ActionsLayout.EnumC3037c) obj2);
            }
        });
        AbstractC5291e abstractC5291e4 = this.f13091O0;
        if (abstractC5291e4 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5291e = abstractC5291e4;
        }
        ConstraintLayout appbar = abstractC5291e.f20204w;
        AbstractC6118n.m27186d(appbar, "appbar");
        appbar.setVisibility(0);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: C2 */
    protected Map mo15787C2() {
        Map mapMo15787C2 = super.mo15787C2();
        mapMo15787C2.put(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.f13021g0.m16267a());
        return mapMo15787C2;
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a
    /* JADX INFO: renamed from: D2 */
    protected Set mo15494D2() {
        if (m15845V1()) {
            return AbstractC1617O.m6652f(AbstractActivityC3130a.d.INTERSTITIAL, AbstractActivityC3130a.d.APP_OPEN, AbstractActivityC3130a.d.NATIVE);
        }
        return null;
    }

    /* JADX INFO: renamed from: E5 */
    public final void m16364E5() {
        m16372y5(C6963T.f27940v0.m30541a(m16310O4()), "fragment_text_generation");
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        TextInputLayout layInputText = abstractC5291e.f20199D;
        AbstractC6118n.m27186d(layInputText, "layInputText");
        layInputText.setVisibility(8);
    }

    /* JADX INFO: renamed from: F4 */
    public final void m16365F4() {
        if (m16306L4() == null) {
            m16355u5();
            return;
        }
        AbstractC5291e abstractC5291e = null;
        if (this.f13089M0 != null) {
            m16372y5(new C6951G(), "fragment_processing");
            AbstractC5291e abstractC5291e2 = this.f13091O0;
            if (abstractC5291e2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e = abstractC5291e2;
            }
            TextInputLayout layInputText = abstractC5291e.f20199D;
            AbstractC6118n.m27186d(layInputText, "layInputText");
            layInputText.setVisibility(8);
            return;
        }
        if (m16313R4() == null) {
            m16333j5(FirebaseAuth.getInstance().mo8683a());
        }
        m16372y5(C6946B.f27900t0.m30486a(m16310O4()), "fragment_options");
        AbstractC5291e abstractC5291e3 = this.f13091O0;
        if (abstractC5291e3 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5291e = abstractC5291e3;
        }
        TextInputLayout layInputText2 = abstractC5291e.f20199D;
        AbstractC6118n.m27186d(layInputText2, "layInputText");
        layInputText2.setVisibility(0);
    }

    /* JADX INFO: renamed from: F5 */
    public final void m16366F5() {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this, R.style.AppTextInputLayout);
        TextInputLayout textInputLayout = new TextInputLayout(contextThemeWrapper);
        textInputLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        AbstractC5291e abstractC5291e = this.f13091O0;
        AbstractC5291e abstractC5291e2 = null;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        textInputLayout.setCounterEnabled(abstractC5291e.f20199D.m21483N());
        AbstractC5291e abstractC5291e3 = this.f13091O0;
        if (abstractC5291e3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e3 = null;
        }
        textInputLayout.setCounterMaxLength(abstractC5291e3.f20199D.getCounterMaxLength());
        final TextInputEditText textInputEditText = new TextInputEditText(contextThemeWrapper);
        textInputEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        AbstractC5291e abstractC5291e4 = this.f13091O0;
        if (abstractC5291e4 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5291e2 = abstractC5291e4;
        }
        textInputEditText.setText(abstractC5291e2.f20196A.getText());
        textInputLayout.addView(textInputEditText);
        FrameLayout frameLayout = new FrameLayout(contextThemeWrapper);
        int i7 = (int) (8 * frameLayout.getContext().getResources().getDisplayMetrics().density);
        frameLayout.setPadding(i7, 0, i7, 0);
        frameLayout.addView(textInputLayout);
        DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = new C7611b(this).m33365P(R.string.text_to_process).mo9117u(frameLayout).m33361L(R.string.ok, new DialogInterface.OnClickListener() { // from class: q1.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AiTextProcessingActivity.m16299G5(this.f27380a, textInputEditText, dialogInterface, i8);
            }
        }).m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: q1.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                AiTextProcessingActivity.m16301H5(dialogInterface, i8);
            }
        }).mo9097a();
        AbstractC6118n.m27186d(dialogInterfaceC2241bMo9097a, "create(...)");
        dialogInterfaceC2241bMo9097a.show();
    }

    /* JADX INFO: renamed from: I5 */
    public final void m16367I5() {
        if (m16300H4()) {
            m16372y5(C6983g0.f27986s0.m30584a(m16310O4()), "fragment_translation");
            AbstractC5291e abstractC5291e = this.f13091O0;
            if (abstractC5291e == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5291e = null;
            }
            TextInputLayout layInputText = abstractC5291e.f20199D;
            AbstractC6118n.m27186d(layInputText, "layInputText");
            layInputText.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: K5 */
    public final void m16368K5(String topic) {
        AbstractC6118n.m27187e(topic, "topic");
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        abstractC5291e.f20196A.setText(topic);
    }

    @Override // com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a
    /* JADX INFO: renamed from: W1 */
    public void mo15563W1(Purchase purchase) {
        AbstractC6118n.m27187e(purchase, "purchase");
        super.mo15563W1(purchase);
        if (m15845V1()) {
            return;
        }
        recreate();
        setResult(-1);
    }

    /* JADX INFO: renamed from: a5 */
    public final void m16369a5(final AiPrompt aiPrompt, final String str) {
        AbstractC6118n.m27187e(aiPrompt, "aiPrompt");
        this.f13095S0 = aiPrompt;
        this.f13096T0 = str;
        if (m16300H4() && m16298G4()) {
            m16261j3(new InterfaceC5356a() { // from class: q1.f
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return AiTextProcessingActivity.m16323c5(this.f27377a, aiPrompt, str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f5 */
    public final void m16370f5() {
        AiPrompt aiPrompt = this.f13095S0;
        if (aiPrompt != null) {
            m16369a5(aiPrompt, this.f13096T0);
        }
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, com.anas_mugally.clipboard.p221ui.AbstractActivityC3140d, androidx.fragment.app.AbstractActivityC2592j, p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13091O0 = (AbstractC5291e) AbstractC2473f.m10831j(this, R.layout.activity_ai_text_processing);
        m16329h5();
        this.f13092P0 = (C7154a) new C2635a0(this).m12591a(C7154a.class);
        this.f13093Q0 = FirebaseAuth.getInstance();
        m16353t5();
        m16341n5();
        if (bundle != null) {
            m16325e5(bundle);
        } else {
            m16314S4();
        }
        m16365F4();
        AbstractC5291e abstractC5291e = this.f13091O0;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        abstractC5291e.f20199D.setCounterMaxLength(m16309N4());
        m16335k5();
        AbstractC5166I.m23950b(mo12238b(), this, false, new InterfaceC5367l() { // from class: q1.l
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AiTextProcessingActivity.m16319X4(this.f27387a, (AbstractC5158A) obj);
            }
        }, 2, null);
    }

    @Override // com.anas_mugally.clipboard.p221ui.ads.BaseMyAppAdsActivity, com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a, com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a, androidx.fragment.app.AbstractActivityC2592j, android.app.Activity
    protected void onResume() {
        super.onResume();
        boolean z7 = m16306L4() != null;
        AbstractC5291e abstractC5291e = this.f13091O0;
        AbstractC5291e abstractC5291e2 = null;
        if (abstractC5291e == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e = null;
        }
        View view = abstractC5291e.f20202G;
        AbstractC6118n.m27186d(view, "view");
        view.setVisibility(m15845V1() && z7 ? 0 : 8);
        AbstractC5291e abstractC5291e3 = this.f13091O0;
        if (abstractC5291e3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5291e3 = null;
        }
        FrameLayout layAd = abstractC5291e3.f20197B;
        AbstractC6118n.m27186d(layAd, "layAd");
        layAd.setVisibility(m15845V1() && z7 ? 0 : 8);
        if (m15845V1() && z7) {
            AbstractC5291e abstractC5291e4 = this.f13091O0;
            if (abstractC5291e4 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5291e2 = abstractC5291e4;
            }
            FrameLayout layAd2 = abstractC5291e2.f20197B;
            AbstractC6118n.m27186d(layAd2, "layAd");
            AbstractActivityC3130a.m16217T2(this, layAd2, R.layout.admob_naitve_small_support_light, null, new AbstractActivityC3130a.a() { // from class: q1.a
                @Override // com.anas_mugally.clipboard.p221ui.ads.AbstractActivityC3130a.a
                /* JADX INFO: renamed from: a */
                public final void mo8536a(boolean z8) {
                    AiTextProcessingActivity.m16320Y4(this.f27372a, z8);
                }
            }, 4, null);
        }
    }

    @Override // p223d.AbstractActivityC5187q, p017C.AbstractActivityC0106g, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        outState.putSerializable("resultData", this.f13089M0);
        outState.putString("originalText", m16310O4());
        super.onSaveInstanceState(outState);
    }

    /* JADX INFO: renamed from: v5 */
    public final void m16371v5(String str) {
        if (m16300H4()) {
            m16372y5(C6967X.f27957v0.m30556a(m16310O4(), str), "fragment_custom_prompt");
            AbstractC5291e abstractC5291e = this.f13091O0;
            if (abstractC5291e == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5291e = null;
            }
            TextInputLayout layInputText = abstractC5291e.f20199D;
            AbstractC6118n.m27186d(layInputText, "layInputText");
            layInputText.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: y5 */
    public final void m16372y5(AbstractComponentCallbacksC2591i fragment, String tag) {
        AbstractC6118n.m27187e(fragment, "fragment");
        AbstractC6118n.m27187e(tag, "tag");
        m12232H0().m12391n().m12512q(R.id.fragment_container, fragment, tag).mo12016g();
    }
}
