package p241f1;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.databinding.AbstractC2473f;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h;
import com.anas_mugally.clipboard.R;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p233e1.AbstractC5306l0;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: f1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C5400E extends DialogInterfaceOnCancelListenerC2590h {

    /* JADX INFO: renamed from: F0 */
    public static final a f20566F0 = new a(null);

    /* JADX INFO: renamed from: E0 */
    private AbstractC5306l0 f20567E0;

    /* JADX INFO: renamed from: f1.E$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C5400E m24487a() {
            return new C5400E();
        }

        private a() {
        }
    }

    public C5400E() {
        super(R.layout.view_replace_dialog);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final void m24484k2(C5400E c5400e, View view) {
        c5400e.mo12082T1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final void m24485l2(C5400E c5400e, AbstractC5306l0 abstractC5306l0, View view) {
        AbstractActivityC2592j abstractActivityC2592jM12184m = c5400e.m12184m();
        AbstractC6118n.m27185c(abstractActivityC2592jM12184m, "null cannot be cast to non-null type kotlin.Function3<kotlin.String, kotlin.String, kotlin.Boolean, kotlin.Unit>");
        ((InterfaceC5372q) AbstractC6104G.m27161d(abstractActivityC2592jM12184m, 3)).mo7830j(String.valueOf(abstractC5306l0.f20288z.getText()), String.valueOf(abstractC5306l0.f20280A.getText()), Boolean.valueOf(abstractC5306l0.f20287y.isChecked()));
        c5400e.mo12082T1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final boolean m24486m2(C5400E c5400e, View view) {
        c5400e.mo12082T1();
        return true;
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
        Dialog dialogM12085W2 = m12085W1();
        AbstractC6118n.m27184b(dialogM12085W2);
        Window window2 = dialogM12085W2.getWindow();
        AbstractC6118n.m27184b(window2);
        window2.setSoftInputMode(5);
        final AbstractC5306l0 abstractC5306l0 = (AbstractC5306l0) AbstractC2473f.m10822a(view);
        if (abstractC5306l0 != null) {
            abstractC5306l0.f20284v.setOnClickListener(new View.OnClickListener() { // from class: f1.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5400E.m24484k2(this.f20562a, view2);
                }
            });
            abstractC5306l0.f20288z.requestFocus();
            abstractC5306l0.f20285w.setOnClickListener(new View.OnClickListener() { // from class: f1.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C5400E.m24485l2(this.f20563a, abstractC5306l0, view2);
                }
            });
            abstractC5306l0.f20288z.requestFocus();
        } else {
            abstractC5306l0 = null;
        }
        AbstractC6118n.m27184b(abstractC5306l0);
        this.f20567E0 = abstractC5306l0;
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: f1.D
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return C5400E.m24486m2(this.f20565a, view2);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC2590h, androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: v0 */
    public void mo681v0(Bundle bundle) {
        super.mo681v0(bundle);
        if (bundle != null) {
            mo12082T1();
        }
        m12091d2(false);
    }
}
