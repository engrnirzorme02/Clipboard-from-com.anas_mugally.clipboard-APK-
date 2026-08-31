package p241f1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import androidx.fragment.app.AbstractActivityC2592j;
import com.anas_mugally.clipboard.R;
import com.google.android.material.bottomsheet.C4428b;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p233e1.AbstractC5334z0;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5371p;
import p371v1.C7200a;

/* JADX INFO: renamed from: f1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C5411i extends C4428b implements TextView.OnEditorActionListener {

    /* JADX INFO: renamed from: L0 */
    public static final a f20591L0 = new a(null);

    /* JADX INFO: renamed from: F0 */
    private boolean f20592F0;

    /* JADX INFO: renamed from: G0 */
    private InterfaceC5356a f20593G0;

    /* JADX INFO: renamed from: H0 */
    private InterfaceC5371p f20594H0;

    /* JADX INFO: renamed from: I0 */
    private InterfaceC5356a f20595I0;

    /* JADX INFO: renamed from: J0 */
    private AbstractC5334z0 f20596J0;

    /* JADX INFO: renamed from: K0 */
    private C7200a f20597K0;

    /* JADX INFO: renamed from: f1.i$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5411i m24530a(boolean z7) {
            C5411i c5411i = new C5411i();
            Bundle bundle = new Bundle();
            bundle.putBoolean("allowBiometric", z7);
            c5411i.m12117E1(bundle);
            return c5411i;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f1.i$b */
    public static final class b implements C7200a.a {
        b() {
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: a */
        public void mo15618a(int i7, CharSequence errString) {
            AbstractC6118n.m27187e(errString, "errString");
            AbstractC5334z0 abstractC5334z0 = C5411i.this.f20596J0;
            if (abstractC5334z0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5334z0 = null;
            }
            abstractC5334z0.f20438x.requestFocus();
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: b */
        public void mo15619b() {
            InterfaceC5356a interfaceC5356a = C5411i.this.f20595I0;
            if (interfaceC5356a != null) {
                interfaceC5356a.invoke();
            }
            C5411i.this.mo12082T1();
        }

        @Override // p371v1.C7200a.a
        /* JADX INFO: renamed from: c */
        public void mo15620c() {
        }
    }

    /* JADX INFO: renamed from: f1.i$c */
    public static final class c implements C7200a.b {
        c() {
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: a */
        public void mo15621a() {
            AbstractC5334z0 abstractC5334z0 = C5411i.this.f20596J0;
            if (abstractC5334z0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5334z0 = null;
            }
            ImageView biometric = abstractC5334z0.f20436v;
            AbstractC6118n.m27186d(biometric, "biometric");
            biometric.setVisibility(8);
        }

        @Override // p371v1.C7200a.b
        /* JADX INFO: renamed from: b */
        public void mo15622b() {
            AbstractC5334z0 abstractC5334z0 = C5411i.this.f20596J0;
            if (abstractC5334z0 == null) {
                AbstractC6118n.m27197o("binding");
                abstractC5334z0 = null;
            }
            ImageView biometric = abstractC5334z0.f20436v;
            AbstractC6118n.m27186d(biometric, "biometric");
            biometric.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: A2 */
    private final void m24513A2() {
        C7200a c7200a = this.f20597K0;
        if (c7200a != null) {
            C7200a.m31774b(c7200a, 0, new b(), new c(), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final void m24520r2(C5411i c5411i, View view) {
        c5411i.m24524v2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final void m24521s2(C5411i c5411i, View view) {
        c5411i.m24513A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final void m24522t2(C5411i c5411i) {
        c5411i.m24513A2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final boolean m24523u2(C5411i c5411i, View view) {
        c5411i.mo12082T1();
        return true;
    }

    /* JADX INFO: renamed from: v2 */
    private final void m24524v2() {
        AbstractC5334z0 abstractC5334z0 = this.f20596J0;
        if (abstractC5334z0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5334z0 = null;
        }
        TextInputEditText inputPassCategory = abstractC5334z0.f20438x;
        AbstractC6118n.m27186d(inputPassCategory, "inputPassCategory");
        inputPassCategory.selectAll();
        InterfaceC5371p interfaceC5371p = this.f20594H0;
        if (interfaceC5371p != null) {
            interfaceC5371p.invoke(String.valueOf(inputPassCategory.getText()), this);
        }
    }

    /* JADX INFO: renamed from: z2 */
    private final void m24525z2() {
        C7200a.c cVar = C7200a.f28714h;
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27186d(abstractActivityC2592jM12211x1, "requireActivity(...)");
        String strM12154X = m12154X(R.string.biometric_title);
        AbstractC6118n.m27186d(strM12154X, "getString(...)");
        String strM12154X2 = m12154X(R.string.biometric_subtitle);
        AbstractC6118n.m27186d(strM12154X2, "getString(...)");
        String strM12154X3 = m12154X(R.string.biometric_button);
        AbstractC6118n.m27186d(strM12154X3, "getString(...)");
        this.f20597K0 = cVar.m31782a(abstractActivityC2592jM12211x1, strM12154X, strM12154X2, strM12154X3);
    }

    /* JADX INFO: renamed from: B2 */
    public final void m24526B2() {
        AbstractC5334z0 abstractC5334z0 = this.f20596J0;
        if (abstractC5334z0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5334z0 = null;
        }
        abstractC5334z0.f20439y.setError(m12154X(R.string.err_pass));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        Window window;
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        Dialog dialogM12085W1 = m12085W1();
        if (dialogM12085W1 != null && (window = dialogM12085W1.getWindow()) != null) {
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setSoftInputMode(5);
        }
        AbstractC2474g abstractC2474gM10822a = AbstractC2473f.m10822a(view);
        AbstractC6118n.m27184b(abstractC2474gM10822a);
        AbstractC5334z0 abstractC5334z0 = (AbstractC5334z0) abstractC2474gM10822a;
        this.f20596J0 = abstractC5334z0;
        AbstractC5334z0 abstractC5334z1 = null;
        if (abstractC5334z0 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5334z0 = null;
        }
        abstractC5334z0.f20438x.requestFocus();
        AbstractC5334z0 abstractC5334z2 = this.f20596J0;
        if (abstractC5334z2 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5334z2 = null;
        }
        abstractC5334z2.f20438x.setOnEditorActionListener(this);
        AbstractC5334z0 abstractC5334z3 = this.f20596J0;
        if (abstractC5334z3 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5334z3 = null;
        }
        abstractC5334z3.f20437w.setOnClickListener(new View.OnClickListener() { // from class: f1.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5411i.m24520r2(this.f20587a, view2);
            }
        });
        AbstractC5334z0 abstractC5334z4 = this.f20596J0;
        if (abstractC5334z4 == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5334z4 = null;
        }
        abstractC5334z4.f20436v.setOnClickListener(new View.OnClickListener() { // from class: f1.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C5411i.m24521s2(this.f20588a, view2);
            }
        });
        C7200a.c cVar = C7200a.f28714h;
        Context contextM12214y1 = m12214y1();
        AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
        if (C7200a.c.m31781c(cVar, contextM12214y1, 0, 2, null) && this.f20592F0 && this.f20595I0 != null) {
            m24525z2();
            view.post(new Runnable() { // from class: f1.g
                @Override // java.lang.Runnable
                public final void run() {
                    C5411i.m24522t2(this.f20589a);
                }
            });
        } else {
            AbstractC5334z0 abstractC5334z5 = this.f20596J0;
            if (abstractC5334z5 == null) {
                AbstractC6118n.m27197o("binding");
            } else {
                abstractC5334z1 = abstractC5334z5;
            }
            ImageView biometric = abstractC5334z1.f20436v;
            AbstractC6118n.m27186d(biometric, "biometric");
            biometric.setVisibility(8);
        }
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: f1.h
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return C5411i.m24523u2(this.f20590a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        AbstractC6118n.m27187e(dialog, "dialog");
        InterfaceC5356a interfaceC5356a = this.f20593G0;
        if (interfaceC5356a != null) {
            interfaceC5356a.invoke();
        }
        super.onDismiss(dialog);
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return true;
        }
        m24524v2();
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        Bundle bundleM12199s = m12199s();
        this.f20592F0 = bundleM12199s != null ? bundleM12199s.getBoolean("allowBiometric") : false;
    }

    /* JADX INFO: renamed from: w2 */
    public final void m24527w2(InterfaceC5356a interfaceC5356a) {
        this.f20593G0 = interfaceC5356a;
    }

    /* JADX INFO: renamed from: x2 */
    public final void m24528x2(InterfaceC5356a interfaceC5356a) {
        this.f20595I0 = interfaceC5356a;
    }

    /* JADX INFO: renamed from: y2 */
    public final void m24529y2(InterfaceC5371p listener) {
        AbstractC6118n.m27187e(listener, "listener");
        this.f20594H0 = listener;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        return inflater.inflate(R.layout.view_unlock_category, viewGroup, false);
    }
}
