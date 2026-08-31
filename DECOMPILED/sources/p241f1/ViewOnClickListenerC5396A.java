package p241f1;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import androidx.databinding.AbstractC2473f;
import androidx.fragment.app.AbstractActivityC2592j;
import com.anas_mugally.clipboard.R;
import com.google.android.material.bottomsheet.C4428b;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p225d1.C5209a;
import p233e1.AbstractC5302j0;
import p238e6.InterfaceC5371p;
import p371v1.C7200a;

/* JADX INFO: renamed from: f1.A */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC5396A extends C4428b implements View.OnClickListener {

    /* JADX INFO: renamed from: J0 */
    public static final a f20555J0 = new a(null);

    /* JADX INFO: renamed from: F0 */
    private C5209a f20556F0;

    /* JADX INFO: renamed from: G0 */
    private AbstractC5302j0 f20557G0;

    /* JADX INFO: renamed from: H0 */
    private C7200a f20558H0;

    /* JADX INFO: renamed from: I0 */
    private InterfaceC5371p f20559I0;

    /* JADX INFO: renamed from: f1.A$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final ViewOnClickListenerC5396A m24480a(C5209a c5209a) {
            ViewOnClickListenerC5396A viewOnClickListenerC5396A = new ViewOnClickListenerC5396A();
            Bundle bundle = new Bundle();
            bundle.putSerializable("category", c5209a);
            viewOnClickListenerC5396A.m12117E1(bundle);
            return viewOnClickListenerC5396A;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f1.A$b */
    public static final class b implements C7200a.a {
        b() {
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: a */
        public void mo15618a(int i7, CharSequence errString) {
            AbstractC6118n.m27187e(errString, "errString");
            AbstractC5302j0 abstractC5302j0 = ViewOnClickListenerC5396A.this.f20557G0;
            if (abstractC5302j0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5302j0 = null;
            }
            abstractC5302j0.f20260v.setChecked(false);
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: b */
        public void mo15619b() {
            ViewOnClickListenerC5396A.this.m24463B2(R.string.allow_open_with_fingerpoint);
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: c */
        public void mo15620c() {
        }
    }

    /* JADX INFO: renamed from: f1.A$c */
    public static final class c implements C7200a.b {
        c() {
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: a */
        public void mo15621a() {
            AbstractC5302j0 abstractC5302j0 = ViewOnClickListenerC5396A.this.f20557G0;
            if (abstractC5302j0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5302j0 = null;
            }
            abstractC5302j0.f20260v.setChecked(false);
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: b */
        public void mo15622b() {
        }
    }

    /* JADX INFO: renamed from: A2 */
    private final void m24462A2() {
        AbstractC5302j0 abstractC5302j0 = this.f20557G0;
        if (abstractC5302j0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5302j0 = null;
        }
        abstractC5302j0.f20261w.setText(m12154X(R.string.add));
        abstractC5302j0.f20256B.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public final void m24463B2(int i7) {
        Toast.makeText(m12204u(), i7, 0).show();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX INFO: renamed from: C2 */
    private final void m24464C2(String str, boolean z7, String str2) {
        String strValueOf;
        boolean z8;
        C5209a c5209a = this.f20556F0;
        if (c5209a == null || (strValueOf = c5209a.m24098d()) == null) {
            strValueOf = String.valueOf(System.currentTimeMillis());
        }
        C5209a c5209a2 = this.f20556F0;
        int iM24100f = c5209a2 != null ? c5209a2.m24100f() : 0;
        if (!z7) {
            str2 = "";
        }
        String str3 = str2;
        if (z7) {
            AbstractC5302j0 abstractC5302j0 = this.f20557G0;
            if (abstractC5302j0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5302j0 = null;
            }
            if (abstractC5302j0.f20260v.isChecked()) {
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            z8 = false;
        }
        C5209a c5209a3 = new C5209a(strValueOf, iM24100f, z7, str3, z8, str);
        InterfaceC5371p interfaceC5371p = this.f20559I0;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(c5209a3, Boolean.valueOf(this.f20556F0 == null));
        }
    }

    /* JADX INFO: renamed from: q2 */
    private final void m24470q2() {
        C7200a c7200a = this.f20558H0;
        if (c7200a != null) {
            C7200a.m31774b(c7200a, 0, new b(), new c(), 1, null);
        }
    }

    /* JADX INFO: renamed from: r2 */
    private final void m24471r2() {
        AbstractC5302j0 abstractC5302j0 = this.f20557G0;
        if (abstractC5302j0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5302j0 = null;
        }
        boolean zIsChecked = abstractC5302j0.f20259E.isChecked();
        String strValueOf = String.valueOf(abstractC5302j0.f20264z.getText());
        String strValueOf2 = String.valueOf(abstractC5302j0.f20263y.getText());
        if (zIsChecked && strValueOf.length() == 0) {
            abstractC5302j0.f20258D.setError(m12154X(R.string.please_input_password));
            abstractC5302j0.f20264z.requestFocus();
        } else if (strValueOf2.length() == 0) {
            abstractC5302j0.f20257C.setError(m12154X(R.string.please_input_name_section));
            abstractC5302j0.f20263y.requestFocus();
        } else {
            m24464C2(strValueOf2, zIsChecked, strValueOf);
            mo12082T1();
        }
    }

    /* JADX INFO: renamed from: s2 */
    private final void m24472s2() {
        AbstractC5302j0 abstractC5302j0 = this.f20557G0;
        if (abstractC5302j0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5302j0 = null;
        }
        C5209a c5209a = this.f20556F0;
        if (c5209a != null) {
            m24474v2(c5209a);
        } else {
            m24462A2();
            C1444v c1444v = C1444v.f4971a;
            abstractC5302j0.f20263y.requestFocus();
        }
        m24475w2();
    }

    /* JADX INFO: renamed from: u2 */
    private final void m24473u2() {
        Window window;
        Dialog dialogM12085W1 = m12085W1();
        if (dialogM12085W1 == null || (window = dialogM12085W1.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.setSoftInputMode(5);
    }

    /* JADX INFO: renamed from: v2 */
    private final void m24474v2(C5209a c5209a) {
        AbstractC5302j0 abstractC5302j0 = this.f20557G0;
        if (abstractC5302j0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5302j0 = null;
        }
        abstractC5302j0.f20261w.setText(m12154X(R.string.text_edit));
        abstractC5302j0.f20263y.setText(c5209a.m24099e());
        abstractC5302j0.f20264z.setText(c5209a.m24101g());
        abstractC5302j0.f20259E.setChecked(c5209a.m24102h());
        ToggleButton biometric = abstractC5302j0.f20260v;
        AbstractC6118n.m27186d(biometric, "biometric");
        C7200a.c cVar = C7200a.f28714h;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        biometric.setVisibility(C7200a.c.m31781c(cVar, contextM12214y1, 0, 2, null) ? 0 : 8);
        ToggleButton biometric2 = abstractC5302j0.f20260v;
        AbstractC6118n.m27186d(biometric2, "biometric");
        biometric2.setEnabled(biometric2.getVisibility() == 0 && c5209a.m24102h());
        abstractC5302j0.f20260v.setChecked(c5209a.m24097c());
        abstractC5302j0.f20256B.setVisibility(0);
        abstractC5302j0.f20263y.requestFocus();
        abstractC5302j0.f20263y.selectAll();
    }

    /* JADX INFO: renamed from: w2 */
    private final void m24475w2() {
        final AbstractC5302j0 abstractC5302j0 = this.f20557G0;
        if (abstractC5302j0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5302j0 = null;
        }
        abstractC5302j0.f20260v.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f1.x
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                ViewOnClickListenerC5396A.m24476x2(abstractC5302j0, this, compoundButton, z7);
            }
        });
        abstractC5302j0.f20259E.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f1.y
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                ViewOnClickListenerC5396A.m24477y2(abstractC5302j0, compoundButton, z7);
            }
        });
        abstractC5302j0.f20261w.setOnClickListener(this);
        abstractC5302j0.m10849k().setOnLongClickListener(new View.OnLongClickListener() { // from class: f1.z
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ViewOnClickListenerC5396A.m24478z2(this.f20659a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final void m24476x2(AbstractC5302j0 abstractC5302j0, ViewOnClickListenerC5396A viewOnClickListenerC5396A, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        if (abstractC5302j0.f20260v.isEnabled() && z7) {
            C7200a c7200a = viewOnClickListenerC5396A.f20558H0;
            if (c7200a == null || !C7200a.m31775d(c7200a, 0, null, 3, null)) {
                abstractC5302j0.f20260v.setChecked(false);
            } else {
                viewOnClickListenerC5396A.m24470q2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final void m24477y2(AbstractC5302j0 abstractC5302j0, CompoundButton compoundButton, boolean z7) {
        AbstractC6118n.m27187e(compoundButton, "<unused var>");
        abstractC5302j0.f20260v.setEnabled(z7);
        if (!z7) {
            abstractC5302j0.f20260v.setChecked(false);
        }
        abstractC5302j0.f20258D.setEnabled(z7);
        if (z7) {
            abstractC5302j0.f20264z.requestFocus();
        } else {
            abstractC5302j0.f20264z.setText("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final boolean m24478z2(ViewOnClickListenerC5396A viewOnClickListenerC5396A, View view) {
        viewOnClickListenerC5396A.mo12082T1();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public void mo12080R0(Bundle outState) {
        AbstractC6118n.m27187e(outState, "outState");
        outState.putSerializable("category", this.f20556F0);
        super.mo12080R0(outState);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        m24473u2();
        m24472s2();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC6118n.m27187e(view, "view");
        if (view.getId() == R.id.btn_add_or_edit_category) {
            m24471r2();
        }
    }

    /* JADX INFO: renamed from: t2 */
    public final void m24479t2(InterfaceC5371p listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f20559I0 = listener;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        if (bundle != null) {
            mo12082T1();
        }
        Bundle bundleM12199s = m12199s();
        this.f20556F0 = (C5209a) (bundleM12199s != null ? bundleM12199s.getSerializable("category") : null);
        C7200a.c cVar = C7200a.f28714h;
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27185c(abstractActivityC2592jM12211x1, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        String strM12154X = m12154X(R.string.biometric_title);
        AbstractC6118n.m27186d(strM12154X, "getString(...)");
        String strM12154X2 = m12154X(R.string.biometric_subtitle);
        AbstractC6118n.m27186d(strM12154X2, "getString(...)");
        String strM12154X3 = m12154X(R.string.cancel);
        AbstractC6118n.m27186d(strM12154X3, "getString(...)");
        this.f20558H0 = cVar.m31782a(abstractActivityC2592jM12211x1, strM12154X, strM12154X2, strM12154X3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5302j0 abstractC5302j0 = (AbstractC5302j0) AbstractC2473f.m10829h(inflater, R.layout.view_manage_category, viewGroup, false);
        this.f20557G0 = abstractC5302j0;
        if (abstractC5302j0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5302j0 = null;
        }
        View viewM10849k = abstractC5302j0.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
