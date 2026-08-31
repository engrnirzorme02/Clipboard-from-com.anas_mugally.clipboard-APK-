package p297m1;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.databinding.AbstractC2473f;
import androidx.databinding.AbstractC2474g;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import com.anas_mugally.clipboard.AbstractC3041D;
import com.anas_mugally.clipboard.C3034A;
import com.anas_mugally.clipboard.R;
import com.anas_mugally.clipboard.p221ui.AbstractViewOnClickListenerC3111a;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.C1444v;
import p145S5.InterfaceC1429g;
import p233e1.AbstractC5272O;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p241f1.C5425w;
import p405z3.C7611b;

/* JADX INFO: renamed from: m1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6327h extends DialogInterfaceOnCancelListenerC2590h {

    /* JADX INFO: renamed from: H0 */
    public static final a f24159H0 = new a(null);

    /* JADX INFO: renamed from: I0 */
    private static final String f24160I0 = "is_rate_app";

    /* JADX INFO: renamed from: E0 */
    private final InterfaceC1429g f24161E0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: m1.b
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return C6327h.m27280z2(this.f24154a);
        }
    });

    /* JADX INFO: renamed from: F0 */
    private final InterfaceC1429g f24162F0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: m1.c
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return C6327h.m27279y2(this.f24155a);
        }
    });

    /* JADX INFO: renamed from: G0 */
    private final InterfaceC1429g f24163G0 = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: m1.d
        @Override // p238e6.InterfaceC5356a
        public final Object invoke() {
            return C6327h.m27270p2(this.f24156a);
        }
    });

    /* JADX INFO: renamed from: m1.h$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DialogInterfaceOnCancelListenerC2590h m27281a() {
            return new C6327h();
        }

        /* JADX INFO: renamed from: b */
        public final String m27282b() {
            return C6327h.f24160I0;
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final AbstractC5272O m27270p2(C6327h c6327h) {
        AbstractC2474g abstractC2474gM10822a = AbstractC2473f.m10822a(c6327h.m12216z1());
        AbstractC6118n.m27184b(abstractC2474gM10822a);
        return (AbstractC5272O) abstractC2474gM10822a;
    }

    /* JADX INFO: renamed from: q2 */
    private final AbstractC5272O m27271q2() {
        return (AbstractC5272O) this.f24163G0.getValue();
    }

    /* JADX INFO: renamed from: r2 */
    private final SharedPreferences m27272r2() {
        Object value = this.f24161E0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: renamed from: s2 */
    private final SharedPreferences.Editor m27273s2() {
        Object value = this.f24162F0.getValue();
        AbstractC6118n.m27186d(value, "getValue(...)");
        return (SharedPreferences.Editor) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final void m27274t2(final C6327h c6327h, RatingBar ratingBar, float f7, boolean z7) {
        ratingBar.setOnRatingBarChangeListener(null);
        if (f7 < 4.0f || !z7) {
            new C7611b(c6327h.m12211x1()).m33365P(R.string.app_name).mo9105i(c6327h.m12154X(R.string.connection_with_us_via_email)).mo9112p(c6327h.m12154X(R.string.send_email), new DialogInterface.OnClickListener() { // from class: m1.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C6327h.m27275u2(this.f24157a, dialogInterface, i7);
                }
            }).m33356G(R.string.cancel, new DialogInterface.OnClickListener() { // from class: m1.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i7) {
                    C6327h.m27276v2(this.f24158a, dialogInterface, i7);
                }
            }).mo9097a().show();
        } else {
            Toast.makeText(c6327h.m12184m(), R.string.please_rate_app, 0).show();
            C3034A c3034a = C3034A.f12453a;
            Context contextM12214y1 = c6327h.m12214y1();
            AbstractC6118n.m27186d(contextM12214y1, "requireContext(...)");
            AbstractActivityC2592j abstractActivityC2592jM12211x1 = c6327h.m12211x1();
            AbstractC6118n.m27186d(abstractActivityC2592jM12211x1, "requireActivity(...)");
            c3034a.m15019F(contextM12214y1, AbstractC3041D.m15082g(abstractActivityC2592jM12211x1));
            c6327h.mo12082T1();
        }
        c6327h.m27273s2().putBoolean(f24160I0, true).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final void m27275u2(C6327h c6327h, DialogInterface dialogInterface, int i7) {
        c6327h.m27277w2();
        dialogInterface.dismiss();
        c6327h.mo12082T1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final void m27276v2(C6327h c6327h, DialogInterface dialogInterface, int i7) {
        dialogInterface.dismiss();
        c6327h.mo12082T1();
    }

    /* JADX INFO: renamed from: w2 */
    private final void m27277w2() {
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27186d(abstractActivityC2592jM12211x1, "requireActivity(...)");
        C5425w c5425w = new C5425w(abstractActivityC2592jM12211x1);
        AbstractActivityC2592j abstractActivityC2592jM12211x2 = m12211x1();
        AbstractC6118n.m27185c(abstractActivityC2592jM12211x2, "null cannot be cast to non-null type com.anas_mugally.clipboard.ui.BaseBillingActivity");
        c5425w.m24596f(!((AbstractViewOnClickListenerC3111a) abstractActivityC2592jM12211x2).m15845V1(), new InterfaceC5367l() { // from class: m1.g
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return C6327h.m27278x2((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final C1444v m27278x2(String errorMessage) {
        AbstractC6118n.m27187e(errorMessage, "errorMessage");
        return C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final SharedPreferences.Editor m27279y2(C6327h c6327h) {
        return c6327h.m27272r2().edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final SharedPreferences m27280z2(C6327h c6327h) {
        return c6327h.m12211x1().getSharedPreferences("SHARED_NAME", 0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: U0 */
    public void mo1869U0(View view, Bundle bundle) {
        AbstractC6118n.m27187e(view, "view");
        super.mo1869U0(view, bundle);
        Dialog dialogM12085W1 = m12085W1();
        AbstractC6118n.m27184b(dialogM12085W1);
        Window window = dialogM12085W1.getWindow();
        AbstractC6118n.m27184b(window);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        m27271q2().f20103w.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: m1.a
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f7, boolean z7) {
                C6327h.m27274t2(this.f24153a, ratingBar, f7, z7);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        return m12118F().inflate(R.layout.fragment_dialog_rate_app, (ViewGroup) null);
    }
}
