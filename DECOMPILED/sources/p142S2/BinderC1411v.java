package p142S2;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.AbstractC3545a;
import com.google.android.gms.auth.api.signin.C3546b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.AbstractC3766u;

/* JADX INFO: renamed from: S2.v */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC1411v extends AbstractBinderC1406q {

    /* JADX INFO: renamed from: a */
    private final Context f4914a;

    public BinderC1411v(Context context) {
        this.f4914a = context;
    }

    /* JADX INFO: renamed from: L0 */
    private final void m6001L0() {
        if (AbstractC3766u.m18210a(this.f4914a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // p142S2.InterfaceC1407r
    /* JADX INFO: renamed from: g */
    public final void mo5997g() {
        m6001L0();
        Context context = this.f4914a;
        C1392c c1392cM5970b = C1392c.m5970b(context);
        GoogleSignInAccount googleSignInAccountM5973c = c1392cM5970b.m5973c();
        GoogleSignInOptions googleSignInOptionsM5974d = GoogleSignInOptions.f14470w;
        if (googleSignInAccountM5973c != null) {
            googleSignInOptionsM5974d = c1392cM5970b.m5974d();
        }
        C3546b c3546bM17728b = AbstractC3545a.m17728b(context, googleSignInOptionsM5974d);
        if (googleSignInAccountM5973c != null) {
            c3546bM17728b.m17732e();
        } else {
            c3546bM17728b.signOut();
        }
    }

    @Override // p142S2.InterfaceC1407r
    /* JADX INFO: renamed from: s */
    public final void mo5998s() {
        m6001L0();
        C1405p.m5993a(this.f4914a).m5995b();
    }
}
