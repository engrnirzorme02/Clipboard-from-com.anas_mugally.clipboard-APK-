package p347s1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.models.TranslationLanguage;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3135b;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p233e1.AbstractC5276T;
import p238e6.InterfaceC5356a;
import p355t1.C7072c;
import p371v1.C7210k;

/* JADX INFO: renamed from: s1.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6983g0 extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: s0 */
    public static final a f27986s0 = new a(null);

    /* JADX INFO: renamed from: o0 */
    private AbstractC5276T f27987o0;

    /* JADX INFO: renamed from: p0 */
    private String f27988p0;

    /* JADX INFO: renamed from: q0 */
    private TranslationLanguage f27989q0;

    /* JADX INFO: renamed from: r0 */
    private final C3135b f27990r0 = new C3135b();

    /* JADX INFO: renamed from: s1.g0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6983g0 m30584a(String text) {
            AbstractC6118n.m27187e(text, "text");
            C6983g0 c6983g0 = new C6983g0();
            Bundle bundle = new Bundle();
            bundle.putString("arg_text", text);
            c6983g0.m12117E1(bundle);
            return c6983g0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: V1 */
    private final void m30572V1() {
        Object obj = null;
        String string = m12211x1().getSharedPreferences("translation_prefs", 0).getString("last_selected_language", null);
        if (string != null) {
            for (Object obj2 : C7072c.f28239a.m31180a()) {
                if (AbstractC6118n.m27183a(((TranslationLanguage) obj2).getCode(), string)) {
                    obj = obj2;
                    break;
                }
            }
            this.f27989q0 = (TranslationLanguage) obj;
            m30583g2();
        }
    }

    /* JADX INFO: renamed from: W1 */
    private final void m30573W1(TranslationLanguage translationLanguage) {
        m12211x1().getSharedPreferences("translation_prefs", 0).edit().putString("last_selected_language", translationLanguage.getCode()).apply();
    }

    /* JADX INFO: renamed from: X1 */
    private final void m30574X1() {
        final AbstractC5276T abstractC5276T = this.f27987o0;
        if (abstractC5276T == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5276T = null;
        }
        abstractC5276T.f20113w.setOnClickListener(new View.OnClickListener() { // from class: s1.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6983g0.m30575Y1(this.f27975a, view);
            }
        });
        abstractC5276T.f20112v.setOnClickListener(new View.OnClickListener() { // from class: s1.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6983g0.m30576Z1(this.f27977a, view);
            }
        });
        abstractC5276T.f20115y.setOnClickListener(new View.OnClickListener() { // from class: s1.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6983g0.m30577a2(abstractC5276T, view);
            }
        });
        abstractC5276T.f20114x.setOnClickListener(new View.OnClickListener() { // from class: s1.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6983g0.m30578b2(this.f27981a, view);
            }
        });
        m30582f2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final void m30575Y1(C6983g0 c6983g0, View view) {
        c6983g0.m30579c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final void m30576Z1(C6983g0 c6983g0, View view) {
        c6983g0.m30579c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final void m30577a2(AbstractC5276T abstractC5276T, View view) {
        abstractC5276T.f20112v.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final void m30578b2(C6983g0 c6983g0, View view) {
        c6983g0.m30581e2();
    }

    /* JADX INFO: renamed from: c2 */
    private final void m30579c2() {
        MaterialButton materialButton;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        List<TranslationLanguage> listM31180a = C7072c.f28239a.m31180a();
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listM31180a, 10));
        for (final TranslationLanguage translationLanguage : listM31180a) {
            arrayList.add(new C7210k.d(translationLanguage.getNativeName() + " (" + translationLanguage.getName() + ')', null, new InterfaceC5356a() { // from class: s1.f0
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C6983g0.m30580d2(this.f27983a, translationLanguage);
                }
            }, null, null, 26, null));
        }
        AbstractC5276T abstractC5276T = null;
        if (this.f27989q0 != null) {
            AbstractC5276T abstractC5276T2 = this.f27987o0;
            if (abstractC5276T2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5276T = abstractC5276T2;
            }
            materialButton = abstractC5276T.f20112v;
        } else {
            AbstractC5276T abstractC5276T3 = this.f27987o0;
            if (abstractC5276T3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5276T = abstractC5276T3;
            }
            materialButton = abstractC5276T.f20113w;
        }
        AbstractC6118n.m27184b(materialButton);
        C7210k.m31796O(c7210k, materialButton, arrayList, null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C1444v m30580d2(C6983g0 c6983g0, TranslationLanguage translationLanguage) {
        c6983g0.f27989q0 = translationLanguage;
        c6983g0.m30573W1(translationLanguage);
        c6983g0.m30583g2();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: e2 */
    private final void m30581e2() {
        TranslationLanguage translationLanguage = this.f27989q0;
        if (translationLanguage != null) {
            AiPrompt aiPromptM16400z = this.f27990r0.m16400z(translationLanguage.getName());
            AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
            AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
            ((AiTextProcessingActivity) abstractActivityC2592jM12184m).m16369a5(aiPromptM16400z, translationLanguage.getName());
        }
    }

    /* JADX INFO: renamed from: f2 */
    private final void m30582f2() {
        boolean z7 = this.f27989q0 != null;
        AbstractC5276T abstractC5276T = this.f27987o0;
        if (abstractC5276T == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5276T = null;
        }
        abstractC5276T.f20114x.setEnabled(z7);
        if (z7) {
            abstractC5276T.f20113w.setVisibility(8);
            abstractC5276T.f20115y.setVisibility(0);
        } else {
            abstractC5276T.f20113w.setVisibility(0);
            abstractC5276T.f20115y.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: g2 */
    private final void m30583g2() {
        TranslationLanguage translationLanguage = this.f27989q0;
        if (translationLanguage != null) {
            AbstractC5276T abstractC5276T = this.f27987o0;
            if (abstractC5276T == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5276T = null;
            }
            abstractC5276T.f20113w.setText(String.valueOf(translationLanguage.getNativeName()));
            abstractC5276T.f20115y.setVisibility(0);
            abstractC5276T.f20113w.setVisibility(8);
            abstractC5276T.f20116z.setText(translationLanguage.getNativeName() + " (" + translationLanguage.getName() + ')');
        }
        m30582f2();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        String string;
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        Bundle bundleM12199s = m12199s();
        if (bundleM12199s == null || (string = bundleM12199s.getString("arg_text")) == null) {
            string = "";
        }
        this.f27988p0 = string;
        m30574X1();
        m30572V1();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5276T abstractC5276TM24290u = AbstractC5276T.m24290u(inflater, viewGroup, false);
        this.f27987o0 = abstractC5276TM24290u;
        if (abstractC5276TM24290u == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5276TM24290u = null;
        }
        View viewM10849k = abstractC5276TM24290u.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
