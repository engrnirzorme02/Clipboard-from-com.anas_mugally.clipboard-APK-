package p307n3;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.internal.AbstractC3686c;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.common.internal.C3673Q;
import com.google.android.gms.common.internal.C3690e;
import p142S2.C1392c;
import p170W2.C1837b;
import p299m3.InterfaceC6338e;

/* JADX INFO: renamed from: n3.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6483a extends AbstractC3696h implements InterfaceC6338e {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f24543e = 0;

    /* JADX INFO: renamed from: a */
    private final boolean f24544a;

    /* JADX INFO: renamed from: b */
    private final C3690e f24545b;

    /* JADX INFO: renamed from: c */
    private final Bundle f24546c;

    /* JADX INFO: renamed from: d */
    private final Integer f24547d;

    public C6483a(Context context, Looper looper, boolean z7, C3690e c3690e, Bundle bundle, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        super(context, looper, 44, c3690e, bVar, cVar);
        this.f24544a = true;
        this.f24545b = c3690e;
        this.f24546c = bundle;
        this.f24547d = c3690e.m18013j();
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m27651e(C3690e c3690e) {
        c3690e.m18012i();
        Integer numM18013j = c3690e.m18013j();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3690e.m18005b());
        if (numM18013j != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numM18013j.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p299m3.InterfaceC6338e
    /* JADX INFO: renamed from: a */
    public final void mo27294a(InterfaceC6488f interfaceC6488f) {
        AbstractC3718s.m18084m(interfaceC6488f, "Expecting a valid ISignInCallbacks");
        try {
            Account accountM18007d = this.f24545b.m18007d();
            ((C6489g) getService()).m27652L0(new C6492j(1, new C3673Q(accountM18007d, ((Integer) AbstractC3718s.m18083l(this.f24547d)).intValue(), AbstractC3686c.DEFAULT_ACCOUNT.equals(accountM18007d.name) ? C1392c.m5970b(getContext()).m5973c() : null)), interfaceC6488f);
        } catch (RemoteException e7) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC6488f.mo17866J0(new C6494l(1, new C1837b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e7);
            }
        }
    }

    @Override // p299m3.InterfaceC6338e
    /* JADX INFO: renamed from: b */
    public final void mo27295b() {
        connect(new AbstractC3686c.d());
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C6489g ? (C6489g) iInterfaceQueryLocalInterface : new C6489g(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.f24545b.m18010g())) {
            this.f24546c.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f24545b.m18010g());
        }
        return this.f24546c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final boolean requiresSignIn() {
        return this.f24544a;
    }
}
