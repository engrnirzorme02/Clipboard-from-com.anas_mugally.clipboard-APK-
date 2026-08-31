package p347s1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.models.AiPrompt;
import com.anas_mugally.clipboard.p221ui.p222ai.utils.C3135b;
import com.google.android.gms.internal.ads.zzbbn;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1638q;
import p233e1.AbstractC5268K;
import p238e6.InterfaceC5356a;
import p302m6.AbstractC6406h;
import p371v1.C7210k;

/* JADX INFO: renamed from: s1.T */
/* JADX INFO: loaded from: classes.dex */
public final class C6963T extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: v0 */
    public static final a f27940v0 = new a(null);

    /* JADX INFO: renamed from: q0 */
    private AbstractC5268K f27943q0;

    /* JADX INFO: renamed from: r0 */
    private c f27944r0;

    /* JADX INFO: renamed from: s0 */
    private b f27945s0;

    /* JADX INFO: renamed from: o0 */
    private final InterfaceC1429g f27941o0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: s1.H
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return C6963T.m30536v2(this.f27927a);
        }
    });

    /* JADX INFO: renamed from: p0 */
    private final InterfaceC1429g f27942p0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: s1.J
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return C6963T.m30537w2(this.f27930a);
        }
    });

    /* JADX INFO: renamed from: t0 */
    private final int f27946t0 = zzbbn.zzq.zzf;

    /* JADX INFO: renamed from: u0 */
    private final int f27947u0 = 50;

    /* JADX INFO: renamed from: s1.T$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6963T m30541a(String str) {
            C6963T c6963t = new C6963T();
            Bundle bundle = new Bundle();
            bundle.putString("arg_initial_text", str);
            c6963t.m12117E1(bundle);
            return c6963t;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: s1.T$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f27948a;

        /* JADX INFO: renamed from: b */
        private final String f27949b;

        public b(String displayName, String apiValue) {
            AbstractC6118n.m27187e(displayName, "displayName");
            AbstractC6118n.m27187e(apiValue, "apiValue");
            this.f27948a = displayName;
            this.f27949b = apiValue;
        }

        /* JADX INFO: renamed from: a */
        public final String m30542a() {
            return this.f27949b;
        }

        /* JADX INFO: renamed from: b */
        public final String m30543b() {
            return this.f27948a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6118n.m27183a(this.f27948a, bVar.f27948a) && AbstractC6118n.m27183a(this.f27949b, bVar.f27949b);
        }

        public int hashCode() {
            return (this.f27948a.hashCode() * 31) + this.f27949b.hashCode();
        }

        public String toString() {
            return "TextLengthOption(displayName=" + this.f27948a + ", apiValue=" + this.f27949b + ')';
        }
    }

    /* JADX INFO: renamed from: s1.T$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f27950a;

        /* JADX INFO: renamed from: b */
        private final String f27951b;

        public c(String displayName, String apiValue) {
            AbstractC6118n.m27187e(displayName, "displayName");
            AbstractC6118n.m27187e(apiValue, "apiValue");
            this.f27950a = displayName;
            this.f27951b = apiValue;
        }

        /* JADX INFO: renamed from: a */
        public final String m30544a() {
            return this.f27951b;
        }

        /* JADX INFO: renamed from: b */
        public final String m30545b() {
            return this.f27950a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC6118n.m27183a(this.f27950a, cVar.f27950a) && AbstractC6118n.m27183a(this.f27951b, cVar.f27951b);
        }

        public int hashCode() {
            return (this.f27950a.hashCode() * 31) + this.f27951b.hashCode();
        }

        public String toString() {
            return "TextTypeOption(displayName=" + this.f27950a + ", apiValue=" + this.f27951b + ')';
        }
    }

    /* JADX INFO: renamed from: s1.T$d */
    public static final class d implements TextWatcher {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5268K f27952a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6963T f27953b;

        public d(AbstractC5268K abstractC5268K, C6963T c6963t) {
            this.f27952a = abstractC5268K;
            this.f27953b = c6963t;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            Editable text = this.f27952a.f20079A.getText();
            if ((text != null ? text.length() : 0) <= this.f27953b.f27946t0) {
                this.f27952a.f20080B.setError(null);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
        }
    }

    /* JADX INFO: renamed from: A2 */
    private final boolean m30504A2(String str) {
        AbstractC5268K abstractC5268K = this.f27943q0;
        if (abstractC5268K == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5268K = null;
        }
        if (str.length() == 0) {
            abstractC5268K.f20080B.setError(m12154X(R.string.topic_required));
            return false;
        }
        int length = str.length();
        int i7 = this.f27946t0;
        if (length > i7) {
            abstractC5268K.f20080B.setError(m12156Y(R.string.topic_too_long, String.valueOf(i7)));
            return false;
        }
        int length2 = str.length();
        int i8 = this.f27947u0;
        if (length2 < i8) {
            abstractC5268K.f20080B.setError(m12156Y(R.string.topic_too_short, String.valueOf(i8)));
            return false;
        }
        abstractC5268K.f20080B.setError(null);
        return (this.f27944r0 == null || this.f27945s0 == null) ? false : true;
    }

    /* JADX INFO: renamed from: c2 */
    private final String m30517c2(String str, String str2) {
        return "Please generate a " + str + ", Text length: " + str2 + ' ';
    }

    /* JADX INFO: renamed from: d2 */
    private final void m30518d2() {
        String string;
        String string2;
        AbstractC5268K abstractC5268K = this.f27943q0;
        if (abstractC5268K == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5268K = null;
        }
        Editable text = abstractC5268K.f20079A.getText();
        if (text == null || (string2 = text.toString()) == null || (string = AbstractC6406h.m27594S0(string2).toString()) == null) {
            string = "";
        }
        if (m30504A2(string)) {
            c cVar = this.f27944r0;
            AbstractC6118n.m27184b(cVar);
            b bVar = this.f27945s0;
            AbstractC6118n.m27184b(bVar);
            m30523i2();
            AiPrompt aiPromptM16389o = new C3135b().m16389o("Generate Text", m30517c2(cVar.m30544a(), bVar.m30542a()));
            AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
            AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
            ((AiTextProcessingActivity) abstractActivityC2592jM12184m).m16368K5(string);
            AbstractActivityC2592j abstractActivityC2592jM12184m2 = m12184m();
            AbstractC6118n.m27185c(abstractActivityC2592jM12184m2, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.ai.AiTextProcessingActivity");
            AiTextProcessingActivity.m16322b5((AiTextProcessingActivity) abstractActivityC2592jM12184m2, aiPromptM16389o, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: e2 */
    private final List m30519e2() {
        return (List) this.f27941o0.getValue();
    }

    /* JADX INFO: renamed from: f2 */
    private final List m30520f2() {
        return (List) this.f27942p0.getValue();
    }

    /* JADX INFO: renamed from: g2 */
    private final void m30521g2() {
        Bundle bundleM12199s = m12199s();
        AbstractC5268K abstractC5268K = null;
        String string = bundleM12199s != null ? bundleM12199s.getString("arg_initial_text") : null;
        if (string == null || string.length() == 0) {
            return;
        }
        AbstractC5268K abstractC5268K2 = this.f27943q0;
        if (abstractC5268K2 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5268K = abstractC5268K2;
        }
        abstractC5268K.f20079A.setText(string);
    }

    /* JADX INFO: renamed from: h2 */
    private final void m30522h2() {
        Object next;
        SharedPreferences sharedPreferences = m12211x1().getSharedPreferences("text_generation_prefs", 0);
        Object obj = null;
        String string = sharedPreferences.getString("last_selected_text_type", null);
        if (string != null) {
            Iterator it = m30520f2().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC6118n.m27183a(((c) next).m30544a(), string));
            this.f27944r0 = (c) next;
            m30540z2();
        }
        String string2 = sharedPreferences.getString("last_selected_text_length", null);
        if (string2 != null) {
            for (Object obj2 : m30519e2()) {
                if (AbstractC6118n.m27183a(((b) obj2).m30542a(), string2)) {
                    obj = obj2;
                    break;
                }
            }
            this.f27945s0 = (b) obj;
            m30539y2();
        }
        m30538x2();
    }

    /* JADX INFO: renamed from: i2 */
    private final void m30523i2() {
        SharedPreferences.Editor editorEdit = m12211x1().getSharedPreferences("text_generation_prefs", 0).edit();
        c cVar = this.f27944r0;
        if (cVar != null) {
            editorEdit.putString("last_selected_text_type", cVar.m30544a());
        }
        b bVar = this.f27945s0;
        if (bVar != null) {
            editorEdit.putString("last_selected_text_length", bVar.m30542a());
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: j2 */
    private final void m30524j2() {
        final AbstractC5268K abstractC5268K = this.f27943q0;
        if (abstractC5268K == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5268K = null;
        }
        abstractC5268K.f20080B.setCounterMaxLength(this.f27946t0);
        abstractC5268K.f20080B.setCounterEnabled(true);
        TextInputEditText inputTopic = abstractC5268K.f20079A;
        AbstractC6118n.m27186d(inputTopic, "inputTopic");
        inputTopic.addTextChangedListener(new d(abstractC5268K, this));
        abstractC5268K.f20089z.setOnClickListener(new View.OnClickListener() { // from class: s1.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30527m2(this.f27931a, view);
            }
        });
        abstractC5268K.f20086w.setOnClickListener(new View.OnClickListener() { // from class: s1.L
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30528n2(this.f27932a, view);
            }
        });
        abstractC5268K.f20082D.setOnClickListener(new View.OnClickListener() { // from class: s1.M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30529o2(abstractC5268K, view);
            }
        });
        abstractC5268K.f20088y.setOnClickListener(new View.OnClickListener() { // from class: s1.N
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30530p2(this.f27934a, view);
            }
        });
        abstractC5268K.f20085v.setOnClickListener(new View.OnClickListener() { // from class: s1.O
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30531q2(this.f27935a, view);
            }
        });
        abstractC5268K.f20081C.setOnClickListener(new View.OnClickListener() { // from class: s1.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30525k2(abstractC5268K, view);
            }
        });
        abstractC5268K.f20087x.setOnClickListener(new View.OnClickListener() { // from class: s1.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6963T.m30526l2(this.f27937a, view);
            }
        });
        m30538x2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final void m30525k2(AbstractC5268K abstractC5268K, View view) {
        abstractC5268K.f20085v.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final void m30526l2(C6963T c6963t, View view) {
        c6963t.m30518d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final void m30527m2(C6963T c6963t, View view) {
        c6963t.m30534t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final void m30528n2(C6963T c6963t, View view) {
        c6963t.m30534t2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final void m30529o2(AbstractC5268K abstractC5268K, View view) {
        abstractC5268K.f20086w.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final void m30530p2(C6963T c6963t, View view) {
        c6963t.m30532r2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final void m30531q2(C6963T c6963t, View view) {
        c6963t.m30532r2();
    }

    /* JADX INFO: renamed from: r2 */
    private final void m30532r2() {
        MaterialButton materialButton;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        List<b> listM30519e2 = m30519e2();
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listM30519e2, 10));
        for (final b bVar : listM30519e2) {
            arrayList.add(new C7210k.d(bVar.m30543b(), null, new InterfaceC5356a() { // from class: s1.I
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C6963T.m30533s2(this.f27928a, bVar);
                }
            }, null, null, 26, null));
        }
        AbstractC5268K abstractC5268K = null;
        if (this.f27945s0 != null) {
            AbstractC5268K abstractC5268K2 = this.f27943q0;
            if (abstractC5268K2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5268K = abstractC5268K2;
            }
            materialButton = abstractC5268K.f20085v;
        } else {
            AbstractC5268K abstractC5268K3 = this.f27943q0;
            if (abstractC5268K3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5268K = abstractC5268K3;
            }
            materialButton = abstractC5268K.f20088y;
        }
        AbstractC6118n.m27184b(materialButton);
        C7210k.m31796O(c7210k, materialButton, arrayList, null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C1444v m30533s2(C6963T c6963t, b bVar) {
        c6963t.f27945s0 = bVar;
        c6963t.m30539y2();
        c6963t.m30538x2();
        return C1444v.f4971a;
    }

    /* JADX INFO: renamed from: t2 */
    private final void m30534t2() {
        MaterialButton materialButton;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        C7210k c7210k = new C7210k(contextM12214y1);
        List<c> listM30520f2 = m30520f2();
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listM30520f2, 10));
        for (final c cVar : listM30520f2) {
            arrayList.add(new C7210k.d(cVar.m30545b(), null, new InterfaceC5356a() { // from class: s1.S
                @Override // p238e6.InterfaceC5356a
                public final Object invoke() {
                    return C6963T.m30535u2(this.f27938a, cVar);
                }
            }, null, null, 26, null));
        }
        AbstractC5268K abstractC5268K = null;
        if (this.f27944r0 != null) {
            AbstractC5268K abstractC5268K2 = this.f27943q0;
            if (abstractC5268K2 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5268K = abstractC5268K2;
            }
            materialButton = abstractC5268K.f20086w;
        } else {
            AbstractC5268K abstractC5268K3 = this.f27943q0;
            if (abstractC5268K3 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5268K = abstractC5268K3;
            }
            materialButton = abstractC5268K.f20089z;
        }
        AbstractC6118n.m27184b(materialButton);
        C7210k.m31796O(c7210k, materialButton, arrayList, null, null, true, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final C1444v m30535u2(C6963T c6963t, c cVar) {
        c6963t.f27944r0 = cVar;
        c6963t.m30540z2();
        c6963t.m30538x2();
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final List m30536v2(C6963T c6963t) {
        String[] stringArray = c6963t.m12147R().getStringArray(R.array.text_lengths);
        AbstractC6118n.m27186d(stringArray, "getStringArray(...)");
        String[] stringArray2 = c6963t.m12147R().getStringArray(R.array.text_lengths_api);
        AbstractC6118n.m27186d(stringArray2, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            String str = stringArray[i7];
            int i9 = i8 + 1;
            AbstractC6118n.m27184b(str);
            String str2 = stringArray2[i8];
            AbstractC6118n.m27186d(str2, "get(...)");
            arrayList.add(new b(str, str2));
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final List m30537w2(C6963T c6963t) {
        String[] stringArray = c6963t.m12147R().getStringArray(R.array.text_types);
        AbstractC6118n.m27186d(stringArray, "getStringArray(...)");
        String[] stringArray2 = c6963t.m12147R().getStringArray(R.array.text_types_api);
        AbstractC6118n.m27186d(stringArray2, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        int length = stringArray.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            String str = stringArray[i7];
            int i9 = i8 + 1;
            AbstractC6118n.m27184b(str);
            String str2 = stringArray2[i8];
            AbstractC6118n.m27186d(str2, "get(...)");
            arrayList.add(new c(str, str2));
            i7++;
            i8 = i9;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x2 */
    private final void m30538x2() {
        boolean z7 = this.f27944r0 != null;
        boolean z8 = this.f27945s0 != null;
        AbstractC5268K abstractC5268K = this.f27943q0;
        if (abstractC5268K == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5268K = null;
        }
        abstractC5268K.f20087x.setEnabled(z7 && z8);
        if (z7) {
            abstractC5268K.f20089z.setVisibility(8);
            abstractC5268K.f20082D.setVisibility(0);
        } else {
            abstractC5268K.f20089z.setVisibility(0);
            abstractC5268K.f20082D.setVisibility(8);
        }
        if (z8) {
            abstractC5268K.f20088y.setVisibility(8);
            abstractC5268K.f20081C.setVisibility(0);
        } else {
            abstractC5268K.f20088y.setVisibility(0);
            abstractC5268K.f20081C.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: y2 */
    private final void m30539y2() {
        b bVar = this.f27945s0;
        if (bVar != null) {
            AbstractC5268K abstractC5268K = this.f27943q0;
            if (abstractC5268K == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5268K = null;
            }
            abstractC5268K.f20088y.setText(bVar.m30543b());
            abstractC5268K.f20081C.setVisibility(0);
            abstractC5268K.f20088y.setVisibility(8);
            abstractC5268K.f20083E.setText(bVar.m30543b());
        }
    }

    /* JADX INFO: renamed from: z2 */
    private final void m30540z2() {
        c cVar = this.f27944r0;
        if (cVar != null) {
            AbstractC5268K abstractC5268K = this.f27943q0;
            if (abstractC5268K == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5268K = null;
            }
            abstractC5268K.f20089z.setText(cVar.m30545b());
            abstractC5268K.f20082D.setVisibility(0);
            abstractC5268K.f20089z.setVisibility(8);
            abstractC5268K.f20084F.setText(cVar.m30545b());
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        m30524j2();
        m30521g2();
        m30522h2();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5268K abstractC5268KM24280u = AbstractC5268K.m24280u(inflater, viewGroup, false);
        this.f27943q0 = abstractC5268KM24280u;
        if (abstractC5268KM24280u == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5268KM24280u = null;
        }
        View viewM10849k = abstractC5268KM24280u.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
