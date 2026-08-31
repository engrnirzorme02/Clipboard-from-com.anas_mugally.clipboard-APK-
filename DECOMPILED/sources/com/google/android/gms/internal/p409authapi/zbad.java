package com.google.android.gms.internal.p409authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p114O2.AbstractC1132o;
import p114O2.C1118a;
import p177X2.AbstractC1949e;

/* JADX INFO: loaded from: classes2.dex */
public final class zbad extends AbstractC3559g {
    private static final C3553a.g zba;
    private static final C3553a.a zbb;
    private static final C3553a zbc;
    private final String zbd;

    static {
        C3553a.g gVar = new C3553a.g();
        zba = gVar;
        zbw zbwVar = new zbw();
        zbb = zbwVar;
        zbc = new C3553a("Auth.Api.Identity.Authorization.API", zbwVar, gVar);
    }

    public zbad(Activity activity, AbstractC1132o abstractC1132o) {
        super(activity, zbc, (C3553a.d) abstractC1132o, AbstractC3559g.a.f14540c);
        this.zbd = zbaw.zba();
    }

    public final Task<C1118a> authorize(AuthorizationRequest authorizationRequest) {
        AbstractC3718s.m18083l(authorizationRequest);
        AuthorizationRequest.C3533a c3533aM17641c0 = AuthorizationRequest.m17641c0(authorizationRequest);
        c3533aM17641c0.m17659i(this.zbd);
        final AuthorizationRequest authorizationRequestM17652b = c3533aM17641c0.m17652b();
        return doRead(AbstractC3632w.m17942a().m17950d(zbav.zbc).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbac
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                ((zbj) zbfVar.getService()).zbc(new zbx(this.zba, (TaskCompletionSource) obj2), (AuthorizationRequest) AbstractC3718s.m18083l(authorizationRequestM17652b), zbaz.zba(zbfVar.getContext()));
            }
        }).m17949c(false).m17951e(1534).m17947a());
    }

    public final Task<Void> clearToken(ClearTokenRequest clearTokenRequest) {
        AbstractC3718s.m18083l(clearTokenRequest);
        ClearTokenRequest.AbstractC3535a abstractC3535aM17662V = clearTokenRequest.m17662V();
        abstractC3535aM17662V.mo17664b(this.zbd);
        final ClearTokenRequest clearTokenRequestMo17663a = abstractC3535aM17662V.mo17663a();
        return doWrite(AbstractC3632w.m17942a().m17950d(zbav.zbe).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbab
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                ((zbj) zbfVar.getService()).zbe(new zbz(this.zba, (TaskCompletionSource) obj2), (ClearTokenRequest) AbstractC3718s.m18083l(clearTokenRequestMo17663a), zbaz.zba(zbfVar.getContext()));
            }
        }).m17949c(true).m17951e(1721).m17947a());
    }

    public final C1118a getAuthorizationResultFromIntent(Intent intent) throws C3554b {
        if (intent == null) {
            throw new C3554b(Status.f14515s);
        }
        Status status = (Status) AbstractC1949e.m8080b(intent, "status", Status.CREATOR);
        if (status == null) {
            throw new C3554b(Status.f14517u);
        }
        if (!status.m17747X()) {
            throw new C3554b(status);
        }
        C1118a c1118a = (C1118a) AbstractC1949e.m8080b(intent, "authorization_result", C1118a.CREATOR);
        if (c1118a != null) {
            return c1118a;
        }
        throw new C3554b(Status.f14515s);
    }

    public final Task<Void> revokeAccess(RevokeAccessRequest revokeAccessRequest) {
        AbstractC3718s.m18083l(revokeAccessRequest);
        RevokeAccessRequest.AbstractC3536a abstractC3536aM17668W = revokeAccessRequest.m17668W();
        abstractC3536aM17668W.mo17670b(this.zbd);
        final RevokeAccessRequest revokeAccessRequestMo17669a = abstractC3536aM17668W.mo17669a();
        return doWrite(AbstractC3632w.m17942a().m17950d(zbav.zbd).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbaa
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbf zbfVar = (zbf) obj;
                ((zbj) zbfVar.getService()).zbd(new zby(this.zba, (TaskCompletionSource) obj2), (RevokeAccessRequest) AbstractC3718s.m18083l(revokeAccessRequestMo17669a), zbaz.zba(zbfVar.getContext()));
            }
        }).m17949c(true).m17951e(1721).m17947a());
    }

    public zbad(Context context, AbstractC1132o abstractC1132o) {
        super(context, zbc, abstractC1132o, AbstractC3559g.a.f14540c);
        this.zbd = zbaw.zba();
    }
}
