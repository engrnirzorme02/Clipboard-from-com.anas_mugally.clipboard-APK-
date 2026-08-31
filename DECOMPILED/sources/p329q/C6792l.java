package p329q;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC2241b;
import androidx.core.content.AbstractC2436b;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import androidx.lifecycle.C2635a0;
import androidx.lifecycle.InterfaceC2612D;

/* JADX INFO: renamed from: q.l */
/* JADX INFO: loaded from: classes.dex */
public class C6792l extends DialogInterfaceOnCancelListenerC2590h {

    /* JADX INFO: renamed from: E0 */
    final Handler f27327E0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: F0 */
    final Runnable f27328F0 = new a();

    /* JADX INFO: renamed from: G0 */
    C6787g f27329G0;

    /* JADX INFO: renamed from: H0 */
    private int f27330H0;

    /* JADX INFO: renamed from: I0 */
    private int f27331I0;

    /* JADX INFO: renamed from: J0 */
    private ImageView f27332J0;

    /* JADX INFO: renamed from: K0 */
    TextView f27333K0;

    /* JADX INFO: renamed from: q.l$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6792l.this.m29826l2();
        }
    }

    /* JADX INFO: renamed from: q.l$b */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i7) {
            C6792l.this.f27329G0.m29760Y(true);
        }
    }

    /* JADX INFO: renamed from: q.l$c */
    class c implements InterfaceC2612D {
        c() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(Integer num) {
            C6792l c6792l = C6792l.this;
            c6792l.f27327E0.removeCallbacks(c6792l.f27328F0);
            C6792l.this.m29827n2(num.intValue());
            C6792l.this.m29828o2(num.intValue());
            C6792l c6792l2 = C6792l.this;
            c6792l2.f27327E0.postDelayed(c6792l2.f27328F0, 2000L);
        }
    }

    /* JADX INFO: renamed from: q.l$d */
    class d implements InterfaceC2612D {
        d() {
        }

        @Override // androidx.lifecycle.InterfaceC2612D
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo12097b(CharSequence charSequence) {
            C6792l c6792l = C6792l.this;
            c6792l.f27327E0.removeCallbacks(c6792l.f27328F0);
            C6792l.this.m29829p2(charSequence);
            C6792l c6792l2 = C6792l.this;
            c6792l2.f27327E0.postDelayed(c6792l2.f27328F0, 2000L);
        }
    }

    /* JADX INFO: renamed from: q.l$e */
    private static class e {
        /* JADX INFO: renamed from: a */
        static void m29832a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* JADX INFO: renamed from: q.l$f */
    private static class f {
        /* JADX INFO: renamed from: a */
        static int m29833a() {
            return AbstractC6796p.f27343a;
        }
    }

    /* JADX INFO: renamed from: h2 */
    private void m29821h2() {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        if (abstractActivityC2592jM12184m == null) {
            return;
        }
        C6787g c6787g = (C6787g) new C2635a0(abstractActivityC2592jM12184m).m12591a(C6787g.class);
        this.f27329G0 = c6787g;
        c6787g.m29777r().m12674k(this, new c());
        this.f27329G0.m29775p().m12674k(this, new d());
    }

    /* JADX INFO: renamed from: i2 */
    private Drawable m29822i2(int i7, int i8) {
        int i9;
        Context contextM12204u = m12204u();
        if (contextM12204u == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i7 == 0 && i8 == 1) {
            i9 = AbstractC6797q.f27345b;
        } else if (i7 == 1 && i8 == 2) {
            i9 = AbstractC6797q.f27344a;
        } else if (i7 == 2 && i8 == 1) {
            i9 = AbstractC6797q.f27345b;
        } else {
            if (i7 != 1 || i8 != 3) {
                return null;
            }
            i9 = AbstractC6797q.f27345b;
        }
        return AbstractC2436b.getDrawable(contextM12204u, i9);
    }

    /* JADX INFO: renamed from: j2 */
    private int m29823j2(int i7) {
        Context contextM12204u = m12204u();
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        if (contextM12204u == null || abstractActivityC2592jM12184m == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        contextM12204u.getTheme().resolveAttribute(i7, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = abstractActivityC2592jM12184m.obtainStyledAttributes(typedValue.data, new int[]{i7});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    /* JADX INFO: renamed from: k2 */
    static C6792l m29824k2() {
        return new C6792l();
    }

    /* JADX INFO: renamed from: m2 */
    private boolean m29825m2(int i7, int i8) {
        if (i7 == 0 && i8 == 1) {
            return false;
        }
        if (i7 == 1 && i8 == 2) {
            return true;
        }
        return i7 == 2 && i8 == 1;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: L0 */
    public void mo677L0() {
        super.mo677L0();
        this.f27327E0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: Q0 */
    public void mo680Q0() {
        super.mo680Q0();
        this.f27329G0.m29757V(0);
        this.f27329G0.m29758W(1);
        this.f27329G0.m29756U(m12154X(AbstractC6800t.f27353c));
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h
    /* JADX INFO: renamed from: Y1 */
    public Dialog mo7648Y1(Bundle bundle) {
        DialogInterfaceC2241b.a aVar = new DialogInterfaceC2241b.a(m12214y1());
        aVar.mo9116t(this.f27329G0.m29782w());
        View viewInflate = LayoutInflater.from(aVar.m9098b()).inflate(AbstractC6799s.f27350a, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC6798r.f27349d);
        if (textView != null) {
            CharSequence charSequenceM29781v = this.f27329G0.m29781v();
            if (TextUtils.isEmpty(charSequenceM29781v)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequenceM29781v);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(AbstractC6798r.f27346a);
        if (textView2 != null) {
            CharSequence charSequenceM29774o = this.f27329G0.m29774o();
            if (TextUtils.isEmpty(charSequenceM29774o)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(charSequenceM29774o);
            }
        }
        this.f27332J0 = (ImageView) viewInflate.findViewById(AbstractC6798r.f27348c);
        this.f27333K0 = (TextView) viewInflate.findViewById(AbstractC6798r.f27347b);
        aVar.mo9107k(AbstractC6782b.m29634c(this.f27329G0.m29764e()) ? m12154X(AbstractC6800t.f27351a) : this.f27329G0.m29780u(), new b());
        aVar.mo9117u(viewInflate);
        DialogInterfaceC2241b dialogInterfaceC2241bMo9097a = aVar.mo9097a();
        dialogInterfaceC2241bMo9097a.setCanceledOnTouchOutside(false);
        return dialogInterfaceC2241bMo9097a;
    }

    /* JADX INFO: renamed from: l2 */
    void m29826l2() {
        Context contextM12204u = m12204u();
        if (contextM12204u == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f27329G0.m29758W(1);
            this.f27329G0.m29756U(contextM12204u.getString(AbstractC6800t.f27353c));
        }
    }

    /* JADX INFO: renamed from: n2 */
    void m29827n2(int i7) {
        int iM29776q;
        Drawable drawableM29822i2;
        if (this.f27332J0 == null || (drawableM29822i2 = m29822i2((iM29776q = this.f27329G0.m29776q()), i7)) == null) {
            return;
        }
        this.f27332J0.setImageDrawable(drawableM29822i2);
        if (m29825m2(iM29776q, i7)) {
            e.m29832a(drawableM29822i2);
        }
        this.f27329G0.m29757V(i7);
    }

    /* JADX INFO: renamed from: o2 */
    void m29828o2(int i7) {
        TextView textView = this.f27333K0;
        if (textView != null) {
            textView.setTextColor(i7 == 2 ? this.f27330H0 : this.f27331I0);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f27329G0.m29754S(true);
    }

    /* JADX INFO: renamed from: p2 */
    void m29829p2(CharSequence charSequence) {
        TextView textView = this.f27333K0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        m29821h2();
        this.f27330H0 = m29823j2(f.m29833a());
        this.f27331I0 = m29823j2(R.attr.textColorSecondary);
    }
}
