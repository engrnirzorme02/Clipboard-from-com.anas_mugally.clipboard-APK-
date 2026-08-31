package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC2641d0;
import androidx.lifecycle.AbstractC2643e0;
import androidx.lifecycle.InterfaceC2612D;
import androidx.lifecycle.InterfaceC2657s;
import p010B0.AbstractC0054m;
import p223d.DialogC5193w;
import p256h0.AbstractC5540k;

/* JADX INFO: renamed from: androidx.fragment.app.h */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2590h extends AbstractComponentCallbacksC2591i implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: A0 */
    private boolean f10096A0;

    /* JADX INFO: renamed from: B0 */
    private boolean f10097B0;

    /* JADX INFO: renamed from: C0 */
    private boolean f10098C0;

    /* JADX INFO: renamed from: D0 */
    private boolean f10099D0;

    /* JADX INFO: renamed from: o0 */
    private Handler f10100o0;

    /* JADX INFO: renamed from: p0 */
    private Runnable f10101p0;

    /* JADX INFO: renamed from: q0 */
    private DialogInterface.OnCancelListener f10102q0;

    /* JADX INFO: renamed from: r0 */
    private DialogInterface.OnDismissListener f10103r0;

    /* JADX INFO: renamed from: s0 */
    private int f10104s0;

    /* JADX INFO: renamed from: t0 */
    private int f10105t0;

    /* JADX INFO: renamed from: u0 */
    private boolean f10106u0;

    /* JADX INFO: renamed from: v0 */
    private boolean f10107v0;

    /* JADX INFO: renamed from: w0 */
    private int f10108w0;

    /* JADX INFO: renamed from: x0 */
    private boolean f10109x0;

    /* JADX INFO: renamed from: y0 */
    private InterfaceC2612D f10110y0;

    /* JADX INFO: renamed from: z0 */
    private Dialog f10111z0;

    /* JADX INFO: renamed from: androidx.fragment.app.h$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC2590h.this.f10103r0.onDismiss(DialogInterfaceOnCancelListenerC2590h.this.f10111z0);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.h$b */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2590h.this.f10111z0 != null) {
                DialogInterfaceOnCancelListenerC2590h dialogInterfaceOnCancelListenerC2590h = DialogInterfaceOnCancelListenerC2590h.this;
                dialogInterfaceOnCancelListenerC2590h.onCancel(dialogInterfaceOnCancelListenerC2590h.f10111z0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.h$c */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2590h.this.f10111z0 != null) {
                DialogInterfaceOnCancelListenerC2590h dialogInterfaceOnCancelListenerC2590h = DialogInterfaceOnCancelListenerC2590h.this;
                dialogInterfaceOnCancelListenerC2590h.onDismiss(dialogInterfaceOnCancelListenerC2590h.f10111z0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.h$d */
    class d implements InterfaceC2612D {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(InterfaceC2657s interfaceC2657s) {
            if (interfaceC2657s == null || !DialogInterfaceOnCancelListenerC2590h.this.f10107v0) {
                return;
            }
            View viewM12216z1 = DialogInterfaceOnCancelListenerC2590h.this.m12216z1();
            if (viewM12216z1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC2590h.this.f10111z0 != null) {
                if (AbstractC2599q.m12289I0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC2590h.this.f10111z0);
                }
                DialogInterfaceOnCancelListenerC2590h.this.f10111z0.setContentView(viewM12216z1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.h$e */
    class e extends AbstractC5540k {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC5540k f10116a;

        e(AbstractC5540k abstractC5540k) {
            this.f10116a = abstractC5540k;
        }

        @Override // p256h0.AbstractC5540k
        /* JADX INFO: renamed from: d */
        public View mo12098d(int i7) {
            return this.f10116a.mo12099f() ? this.f10116a.mo12098d(i7) : DialogInterfaceOnCancelListenerC2590h.this.m12087Z1(i7);
        }

        @Override // p256h0.AbstractC5540k
        /* JADX INFO: renamed from: f */
        public boolean mo12099f() {
            return this.f10116a.mo12099f() || DialogInterfaceOnCancelListenerC2590h.this.m12088a2();
        }
    }

    public DialogInterfaceOnCancelListenerC2590h() {
        this.f10101p0 = new a();
        this.f10102q0 = new b();
        this.f10103r0 = new c();
        this.f10104s0 = 0;
        this.f10105t0 = 0;
        this.f10106u0 = true;
        this.f10107v0 = true;
        this.f10108w0 = -1;
        this.f10110y0 = new d();
        this.f10099D0 = false;
    }

    /* JADX INFO: renamed from: V1 */
    private void m12076V1(boolean z7, boolean z8, boolean z9) {
        if (this.f10097B0) {
            return;
        }
        this.f10097B0 = true;
        this.f10098C0 = false;
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f10111z0.dismiss();
            if (!z8) {
                if (Looper.myLooper() == this.f10100o0.getLooper()) {
                    onDismiss(this.f10111z0);
                } else {
                    this.f10100o0.post(this.f10101p0);
                }
            }
        }
        this.f10096A0 = true;
        if (this.f10108w0 >= 0) {
            if (z9) {
                m12132K().m12365X0(this.f10108w0, 1);
            } else {
                m12132K().m12362V0(this.f10108w0, 1, z7);
            }
            this.f10108w0 = -1;
            return;
        }
        AbstractC2606x abstractC2606xM12391n = m12132K().m12391n();
        abstractC2606xM12391n.m12513s(true);
        abstractC2606xM12391n.mo12023o(this);
        if (z9) {
            abstractC2606xM12391n.mo12018i();
        } else if (z7) {
            abstractC2606xM12391n.mo12017h();
        } else {
            abstractC2606xM12391n.mo12016g();
        }
    }

    /* JADX INFO: renamed from: b2 */
    private void m12077b2(Bundle bundle) {
        if (this.f10107v0 && !this.f10099D0) {
            try {
                this.f10109x0 = true;
                Dialog dialogMo7648Y1 = mo7648Y1(bundle);
                this.f10111z0 = dialogMo7648Y1;
                if (this.f10107v0) {
                    mo9288f2(dialogMo7648Y1, this.f10104s0);
                    Context contextM12204u = m12204u();
                    if (contextM12204u instanceof Activity) {
                        this.f10111z0.setOwnerActivity((Activity) contextM12204u);
                    }
                    this.f10111z0.setCancelable(this.f10106u0);
                    this.f10111z0.setOnCancelListener(this.f10102q0);
                    this.f10111z0.setOnDismissListener(this.f10103r0);
                    this.f10099D0 = true;
                } else {
                    this.f10111z0 = null;
                }
            } finally {
                this.f10109x0 = false;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: C0 */
    public void mo676C0() {
        super.mo676C0();
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            this.f10096A0 = true;
            dialog.setOnDismissListener(null);
            this.f10111z0.dismiss();
            if (!this.f10097B0) {
                onDismiss(this.f10111z0);
            }
            this.f10111z0 = null;
            this.f10099D0 = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: D0 */
    public void mo12078D0() {
        super.mo12078D0();
        if (!this.f10098C0 && !this.f10097B0) {
            this.f10097B0 = true;
        }
        m12163c0().mo12676p(this.f10110y0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: E0 */
    public LayoutInflater mo12079E0(Bundle bundle) {
        LayoutInflater layoutInflaterMo12079E0 = super.mo12079E0(bundle);
        if (this.f10107v0 && !this.f10109x0) {
            m12077b2(bundle);
            if (AbstractC2599q.m12289I0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f10111z0;
            if (dialog != null) {
                return layoutInflaterMo12079E0.cloneInContext(dialog.getContext());
            }
        } else if (AbstractC2599q.m12289I0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f10107v0) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterMo12079E0;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterMo12079E0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: R0 */
    public void mo12080R0(Bundle bundle) {
        super.mo12080R0(bundle);
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i7 = this.f10104s0;
        if (i7 != 0) {
            bundle.putInt("android:style", i7);
        }
        int i8 = this.f10105t0;
        if (i8 != 0) {
            bundle.putInt("android:theme", i8);
        }
        boolean z7 = this.f10106u0;
        if (!z7) {
            bundle.putBoolean("android:cancelable", z7);
        }
        boolean z8 = this.f10107v0;
        if (!z8) {
            bundle.putBoolean("android:showsDialog", z8);
        }
        int i9 = this.f10108w0;
        if (i9 != -1) {
            bundle.putInt("android:backStackId", i9);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: S0 */
    public void mo12081S0() {
        super.mo12081S0();
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            this.f10096A0 = false;
            dialog.show();
            View decorView = this.f10111z0.getWindow().getDecorView();
            AbstractC2641d0.m12618a(decorView, this);
            AbstractC2643e0.m12619a(decorView, this);
            AbstractC0054m.m206a(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: T0 */
    public void mo5868T0() {
        super.mo5868T0();
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public void mo12082T1() {
        m12076V1(false, false, false);
    }

    /* JADX INFO: renamed from: U1 */
    public void mo12083U1() {
        m12076V1(true, false, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: V0 */
    public void mo12084V0(Bundle bundle) {
        Bundle bundle2;
        super.mo12084V0(bundle);
        if (this.f10111z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f10111z0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: W1 */
    public Dialog m12085W1() {
        return this.f10111z0;
    }

    /* JADX INFO: renamed from: X1 */
    public int m12086X1() {
        return this.f10105t0;
    }

    /* JADX INFO: renamed from: Y1 */
    public Dialog mo7648Y1(Bundle bundle) {
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC5193w(m12214y1(), m12086X1());
    }

    /* JADX INFO: renamed from: Z1 */
    View m12087Z1(int i7) {
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            return dialog.findViewById(i7);
        }
        return null;
    }

    /* JADX INFO: renamed from: a2 */
    boolean m12088a2() {
        return this.f10099D0;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: c1 */
    void mo12089c1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo12089c1(layoutInflater, viewGroup, bundle);
        if (this.f10138T != null || this.f10111z0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f10111z0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: renamed from: c2 */
    public final Dialog m12090c2() {
        Dialog dialogM12085W1 = m12085W1();
        if (dialogM12085W1 != null) {
            return dialogM12085W1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* JADX INFO: renamed from: d2 */
    public void m12091d2(boolean z7) {
        this.f10106u0 = z7;
        Dialog dialog = this.f10111z0;
        if (dialog != null) {
            dialog.setCancelable(z7);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public void m12092e2(boolean z7) {
        this.f10107v0 = z7;
    }

    /* JADX INFO: renamed from: f2 */
    public void mo9288f2(Dialog dialog, int i7) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* JADX INFO: renamed from: g2 */
    public void mo7649g2(AbstractC2599q abstractC2599q, String str) {
        this.f10097B0 = false;
        this.f10098C0 = true;
        AbstractC2606x abstractC2606xM12391n = abstractC2599q.m12391n();
        abstractC2606xM12391n.m12513s(true);
        abstractC2606xM12391n.m12507d(this, str);
        abstractC2606xM12391n.mo12016g();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: h */
    AbstractC5540k mo12093h() {
        return new e(super.mo12093h());
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f10096A0) {
            return;
        }
        if (AbstractC2599q.m12289I0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m12076V1(true, true, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: p0 */
    public void mo12094p0(Bundle bundle) {
        super.mo12094p0(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: s0 */
    public void mo12095s0(Context context) {
        super.mo12095s0(context);
        m12163c0().m12675l(this.f10110y0);
        if (this.f10098C0) {
            return;
        }
        this.f10097B0 = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        this.f10100o0 = new Handler();
        this.f10107v0 = this.f10128J == 0;
        if (bundle != null) {
            this.f10104s0 = bundle.getInt("android:style", 0);
            this.f10105t0 = bundle.getInt("android:theme", 0);
            this.f10106u0 = bundle.getBoolean("android:cancelable", true);
            this.f10107v0 = bundle.getBoolean("android:showsDialog", this.f10107v0);
            this.f10108w0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public DialogInterfaceOnCancelListenerC2590h(int i7) {
        super(i7);
        this.f10101p0 = new a();
        this.f10102q0 = new b();
        this.f10103r0 = new c();
        this.f10104s0 = 0;
        this.f10105t0 = 0;
        this.f10106u0 = true;
        this.f10107v0 = true;
        this.f10108w0 = -1;
        this.f10110y0 = new d();
        this.f10099D0 = false;
    }
}
