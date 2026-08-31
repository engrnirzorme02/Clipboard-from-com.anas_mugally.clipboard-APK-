package p241f1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import androidx.fragment.app.AbstractActivityC2592j;
import com.anas_mugally.clipboard.R;
import com.google.android.material.bottomsheet.C4428b;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p233e1.AbstractC5294f0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p371v1.C7200a;

/* JADX INFO: renamed from: f1.G */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC5402G extends C4428b implements View.OnClickListener {

    /* JADX INFO: renamed from: L0 */
    public static final a f20569L0 = new a(null);

    /* JADX INFO: renamed from: F0 */
    private AbstractC5294f0 f20570F0;

    /* JADX INFO: renamed from: G0 */
    private C7200a f20571G0;

    /* JADX INFO: renamed from: H0 */
    private InterfaceC5371p f20572H0;

    /* JADX INFO: renamed from: I0 */
    private InterfaceC5356a f20573I0;

    /* JADX INFO: renamed from: J0 */
    private String f20574J0;

    /* JADX INFO: renamed from: K0 */
    private boolean f20575K0;

    /* JADX INFO: renamed from: f1.G$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ViewOnClickListenerC5402G m24501a(String str, boolean z7) {
            ViewOnClickListenerC5402G viewOnClickListenerC5402G = new ViewOnClickListenerC5402G();
            Bundle bundle = new Bundle();
            bundle.putString("arg_password", str);
            bundle.putBoolean("arg_biometric_enabled", z7);
            viewOnClickListenerC5402G.m12117E1(bundle);
            return viewOnClickListenerC5402G;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f1.G$b */
    public static final class b implements C7200a.a {
        b() {
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: a */
        public void mo15618a(int i7, CharSequence errString) {
            AbstractC6118n.m27187e(errString, "errString");
            AbstractC5294f0 abstractC5294f0 = ViewOnClickListenerC5402G.this.f20570F0;
            if (abstractC5294f0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5294f0 = null;
            }
            abstractC5294f0.f20216v.setChecked(false);
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: b */
        public void mo15619b() {
            ViewOnClickListenerC5402G.this.m24498x2(R.string.allow_open_with_fingerpoint);
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: c */
        public void mo15620c() {
        }
    }

    /* JADX INFO: renamed from: f1.G$c */
    public static final class c implements C7200a.b {
        c() {
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: a */
        public void mo15621a() {
            AbstractC5294f0 abstractC5294f0 = ViewOnClickListenerC5402G.this.f20570F0;
            if (abstractC5294f0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5294f0 = null;
            }
            abstractC5294f0.f20216v.setChecked(false);
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: b */
        public void mo15622b() {
        }
    }

    /* JADX INFO: renamed from: o2 */
    private final void m24491o2() {
        C7200a c7200a = this.f20571G0;
        if (c7200a != null) {
            C7200a.m31774b(c7200a, 0, new b(), new c(), 1, null);
        }
    }

    /* JADX INFO: renamed from: p2 */
    private final void m24492p2() {
        InterfaceC5371p interfaceC5371p = this.f20572H0;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(null, Boolean.FALSE);
        }
        mo12082T1();
    }

    /* JADX INFO: renamed from: q2 */
    private final void m24493q2() {
        AbstractC5294f0 abstractC5294f0 = this.f20570F0;
        AbstractC5294f0 abstractC5294f1 = null;
        if (abstractC5294f0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5294f0 = null;
        }
        String strValueOf = String.valueOf(abstractC5294f0.f20220z.getText());
        C7200a.c cVar = C7200a.f28714h;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        boolean z7 = false;
        if (C7200a.c.m31781c(cVar, contextM12214y1, 0, 2, null)) {
            AbstractC5294f0 abstractC5294f2 = this.f20570F0;
            if (abstractC5294f2 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5294f2 = null;
            }
            if (abstractC5294f2.f20216v.isChecked()) {
                z7 = true;
            }
        }
        if (strValueOf.length() != 0) {
            InterfaceC5371p interfaceC5371p = this.f20572H0;
            if (interfaceC5371p != null) {
                interfaceC5371p.invoke(strValueOf, Boolean.valueOf(z7));
            }
            mo12082T1();
            return;
        }
        AbstractC5294f0 abstractC5294f3 = this.f20570F0;
        if (abstractC5294f3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5294f3 = null;
        }
        abstractC5294f3.f20214C.setError(m12154X(R.string.please_input_password));
        AbstractC5294f0 abstractC5294f4 = this.f20570F0;
        if (abstractC5294f4 == null) {
            AbstractC6118n.m27197o("binding");
        } else {
            abstractC5294f1 = abstractC5294f4;
        }
        abstractC5294f1.f20220z.requestFocus();
    }

    /* JADX INFO: renamed from: t2 */
    private final void m24494t2() {
        Window window;
        Dialog dialogM12085W1 = m12085W1();
        if (dialogM12085W1 == null || (window = dialogM12085W1.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setSoftInputMode(5);
    }

    /* JADX INFO: renamed from: u2 */
    private final void m24495u2() {
        AbstractC5294f0 abstractC5294f0 = this.f20570F0;
        if (abstractC5294f0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5294f0 = null;
        }
        abstractC5294f0.f20218x.setOnClickListener(this);
        abstractC5294f0.f20217w.setOnClickListener(this);
        abstractC5294f0.f20216v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f1.F
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                ViewOnClickListenerC5402G.m24496v2(this.f20568a, compoundButton, z7);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final void m24496v2(ViewOnClickListenerC5402G viewOnClickListenerC5402G, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (z7) {
            viewOnClickListenerC5402G.m24491o2();
        }
    }

    /* JADX INFO: renamed from: w2 */
    private final void m24497w2() {
        AbstractC5294f0 abstractC5294f0 = this.f20570F0;
        if (abstractC5294f0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5294f0 = null;
        }
        TextInputEditText textInputEditText = abstractC5294f0.f20220z;
        String str = this.f20574J0;
        if (str == null) {
            str = "";
        }
        textInputEditText.setText(str);
        abstractC5294f0.f20220z.requestFocus();
        FrameLayout layBiometric = abstractC5294f0.f20212A;
        AbstractC6118n.m27186d(layBiometric, "layBiometric");
        C7200a.c cVar = C7200a.f28714h;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        layBiometric.setVisibility(C7200a.c.m31781c(cVar, contextM12214y1, 0, 2, null) ? 0 : 8);
        abstractC5294f0.f20216v.setChecked(this.f20575K0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public final void m24498x2(int i7) {
        Toast.makeText(m12204u(), i7, 0).show();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: D0 */
    public void mo12078D0() {
        super.mo12078D0();
        this.f20572H0 = null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        m24494t2();
        m24497w2();
        m24495u2();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC6118n.m27187e(view, "view");
        switch (view.getId()) {
            case R.id.btnRemoveSecurity /* 2131296398 */:
                m24492p2();
                break;
            case R.id.btnSave /* 2131296399 */:
                m24493q2();
                break;
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC6118n.m27187e(dialog, "dialog");
        InterfaceC5356a interfaceC5356a = this.f20573I0;
        if (interfaceC5356a != null) {
            interfaceC5356a.invoke();
        }
        super.onDismiss(dialog);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m24499r2(InterfaceC5356a interfaceC5356a) {
        this.f20573I0 = interfaceC5356a;
    }

    /* JADX INFO: renamed from: s2 */
    public final void m24500s2(InterfaceC5371p listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f20572H0 = listener;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        Bundle bundleM12199s = m12199s();
        if (bundleM12199s != null) {
            this.f20574J0 = bundleM12199s.getString("arg_password");
            this.f20575K0 = bundleM12199s.getBoolean("arg_biometric_enabled");
        }
        C7200a.c cVar = C7200a.f28714h;
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27185c(abstractActivityC2592jM12211x1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        String strM12154X = m12154X(R.string.biometric_title);
        AbstractC6118n.m27186d(strM12154X, "getString(...)");
        String strM12154X2 = m12154X(R.string.biometric_subtitle);
        AbstractC6118n.m27186d(strM12154X2, "getString(...)");
        String strM12154X3 = m12154X(R.string.cancel);
        AbstractC6118n.m27186d(strM12154X3, "getString(...)");
        this.f20571G0 = cVar.m31782a(abstractActivityC2592jM12211x1, strM12154X, strM12154X2, strM12154X3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5294f0 abstractC5294f0 = (AbstractC5294f0) AbstractC2473f.m10829h(inflater, R.layout.view_change_temporary_password, viewGroup, false);
        this.f20570F0 = abstractC5294f0;
        if (abstractC5294f0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5294f0 = null;
        }
        View viewM10849k = abstractC5294f0.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
