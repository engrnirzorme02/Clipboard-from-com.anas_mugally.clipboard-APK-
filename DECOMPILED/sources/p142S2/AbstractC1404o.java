package p142S2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.api.AbstractC3640j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3600g;
import java.util.Iterator;
import p135R2.C1328b;
import p191Z2.C2086a;

/* JADX INFO: renamed from: S2.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1404o {

    /* JADX INFO: renamed from: a */
    private static final C2086a f4909a = new C2086a("GoogleSignInCommon", new String[0]);

    /* JADX INFO: renamed from: a */
    public static Intent m5986a(Context context, GoogleSignInOptions googleSignInOptions) {
        f4909a.m8613a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m5987b(Context context, GoogleSignInOptions googleSignInOptions) {
        f4909a.m8613a("getFallbackSignInIntent()", new Object[0]);
        Intent intentM5986a = m5986a(context, googleSignInOptions);
        intentM5986a.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentM5986a;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m5988c(Context context, GoogleSignInOptions googleSignInOptions) {
        f4909a.m8613a("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentM5986a = m5986a(context, googleSignInOptions);
        intentM5986a.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentM5986a;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC3561i m5989d(AbstractC3560h abstractC3560h, Context context, boolean z7) {
        f4909a.m8613a("Signing out", new Object[0]);
        m5992g(context);
        return z7 ? AbstractC3640j.m17970b(Status.f14513f, abstractC3560h) : abstractC3560h.mo17772b(new C1400k(abstractC3560h));
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC3561i m5990e(AbstractC3560h abstractC3560h, Context context, boolean z7) {
        f4909a.m8613a("Revoking access", new Object[0]);
        String strM5975e = C1392c.m5970b(context).m5975e();
        m5992g(context);
        return z7 ? RunnableC1395f.m5982a(strM5975e) : abstractC3560h.mo17772b(new C1402m(abstractC3560h));
    }

    /* JADX INFO: renamed from: f */
    public static C1328b m5991f(Intent intent) {
        if (intent == null) {
            return new C1328b(null, Status.f14515s);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C1328b(googleSignInAccount, Status.f14513f);
        }
        if (status == null) {
            status = Status.f14515s;
        }
        return new C1328b(null, status);
    }

    /* JADX INFO: renamed from: g */
    private static void m5992g(Context context) {
        C1405p.m5993a(context).m5995b();
        Iterator it = AbstractC3560h.m17770c().iterator();
        while (it.hasNext()) {
            ((AbstractC3560h) it.next()).m17777h();
        }
        C3600g.m17872a();
    }
}
