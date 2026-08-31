package p142S2;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3696h;
import com.google.android.gms.common.internal.C3690e;
import com.google.android.gms.internal.p409authapi.zbaw;
import java.util.Iterator;

/* JADX INFO: renamed from: S2.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1398i extends AbstractC3696h {

    /* JADX INFO: renamed from: a */
    private final GoogleSignInOptions f4906a;

    public C1398i(Context context, Looper looper, C3690e c3690e, GoogleSignInOptions googleSignInOptions, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        super(context, looper, 91, c3690e, bVar, cVar);
        GoogleSignInOptions.C3544a c3544a = googleSignInOptions != null ? new GoogleSignInOptions.C3544a(googleSignInOptions) : new GoogleSignInOptions.C3544a();
        c3544a.m17725g(zbaw.zba());
        if (!c3690e.m18008e().isEmpty()) {
            Iterator it = c3690e.m18008e().iterator();
            while (it.hasNext()) {
                c3544a.m17724f((Scope) it.next(), new Scope[0]);
            }
        }
        this.f4906a = c3544a.m17719a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C1410u ? (C1410u) iInterfaceQueryLocalInterface : new C1410u(iBinder);
    }

    /* JADX INFO: renamed from: e */
    public final GoogleSignInOptions m5985e() {
        return this.f4906a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c, com.google.android.gms.common.api.C3553a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final Intent getSignInIntent() {
        return AbstractC1404o.m5986a(getContext(), this.f4906a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final boolean providesSignIn() {
        return true;
    }
}
