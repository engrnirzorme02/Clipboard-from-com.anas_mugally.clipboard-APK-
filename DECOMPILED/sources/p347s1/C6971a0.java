package p347s1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractActivityC2592j;
import androidx.fragment.app.AbstractComponentCallbacksC2591i;
import com.anas_mugally.clipboard.p221ui.GoogleSignInActivity;
import com.anas_mugally.clipboard.p221ui.p222ai.AiTextProcessingActivity;
import com.google.firebase.auth.AbstractC4880u;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p233e1.AbstractC5274Q;
import p239f.AbstractC5382c;
import p239f.C5380a;
import p239f.InterfaceC5381b;
import p247g.C5449c;

/* JADX INFO: renamed from: s1.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6971a0 extends AbstractComponentCallbacksC2591i {

    /* JADX INFO: renamed from: s0 */
    public static final a f27969s0 = new a(null);

    /* JADX INFO: renamed from: o0 */
    private AbstractC5274Q f27970o0;

    /* JADX INFO: renamed from: p0 */
    private FirebaseAuth f27971p0;

    /* JADX INFO: renamed from: q0 */
    private AbstractC5382c f27972q0;

    /* JADX INFO: renamed from: r0 */
    private String f27973r0 = "";

    /* JADX INFO: renamed from: s1.a0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C6971a0 m30566a(String text) {
            AbstractC6118n.m27187e(text, "text");
            C6971a0 c6971a0 = new C6971a0();
            Bundle bundle = new Bundle();
            bundle.putString("arg_text", text);
            c6971a0.m12117E1(bundle);
            return c6971a0;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: S1 */
    private final void m30559S1() {
        FirebaseAuth firebaseAuth = this.f27971p0;
        if (firebaseAuth == null) {
            AbstractC6118n.m27197o("auth");
            firebaseAuth = null;
        }
        AbstractC4880u abstractC4880uM21989e = firebaseAuth.m21989e();
        if (abstractC4880uM21989e == null || abstractC4880uM21989e.mo8712c0()) {
            return;
        }
        m30561U1();
    }

    /* JADX INFO: renamed from: T1 */
    private final void m30560T1() {
        GoogleSignInActivity.C3086a c3086a = GoogleSignInActivity.f12744j0;
        AbstractActivityC2592j abstractActivityC2592jM12211x1 = m12211x1();
        AbstractC6118n.m27186d(abstractActivityC2592jM12211x1, "requireActivity(...)");
        Intent intentM15423a = c3086a.m15423a(abstractActivityC2592jM12211x1);
        AbstractC5382c abstractC5382c = this.f27972q0;
        if (abstractC5382c == null) {
            AbstractC6118n.m27197o("signInLauncher");
            abstractC5382c = null;
        }
        abstractC5382c.m24394a(intentM15423a);
    }

    /* JADX INFO: renamed from: U1 */
    private final void m30561U1() {
        AbstractActivityC2592j abstractActivityC2592jM12184m = m12184m();
        AiTextProcessingActivity aiTextProcessingActivity = abstractActivityC2592jM12184m instanceof AiTextProcessingActivity ? (AiTextProcessingActivity) abstractActivityC2592jM12184m : null;
        if (aiTextProcessingActivity != null) {
            aiTextProcessingActivity.m16365F4();
        }
    }

    /* JADX INFO: renamed from: V1 */
    private final void m30562V1() {
        this.f27971p0 = FirebaseAuth.getInstance();
        this.f27972q0 = m12206v1(new C5449c(), new InterfaceC5381b() { // from class: s1.Z
            @Override // p239f.InterfaceC5381b
            /* JADX INFO: renamed from: a */
            public final void mo12412a(Object obj) {
                C6971a0.m30563W1(this.f27968a, (C5380a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final void m30563W1(C6971a0 c6971a0, C5380a result) {
        AbstractC6118n.m27187e(result, "result");
        int iM24390b = result.m24390b();
        if (iM24390b == 1001) {
            c6971a0.m30561U1();
        } else {
            if (iM24390b != 1002) {
                return;
            }
            c6971a0.m12211x1().finish();
        }
    }

    /* JADX INFO: renamed from: X1 */
    private final void m30564X1() {
        AbstractC5274Q abstractC5274Q = this.f27970o0;
        if (abstractC5274Q == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5274Q = null;
        }
        abstractC5274Q.f20108v.setOnClickListener(new View.OnClickListener() { // from class: s1.Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6971a0.m30565Y1(this.f27967a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final void m30565Y1(C6971a0 c6971a0, View view) {
        c6971a0.m30560T1();
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
        this.f27973r0 = string;
        m30562V1();
        m30564X1();
        m30559S1();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2591i
    /* JADX INFO: renamed from: z0 */
    public View mo682z0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC6118n.m27187e(inflater, "inflater");
        AbstractC5274Q abstractC5274QM24287u = AbstractC5274Q.m24287u(inflater, viewGroup, false);
        this.f27970o0 = abstractC5274QM24287u;
        if (abstractC5274QM24287u == null) {
            AbstractC6118n.m27197o("binding");
            abstractC5274QM24287u = null;
        }
        View viewM10849k = abstractC5274QM24287u.m10849k();
        AbstractC6118n.m27186d(viewM10849k, "getRoot(...)");
        return viewM10849k;
    }
}
