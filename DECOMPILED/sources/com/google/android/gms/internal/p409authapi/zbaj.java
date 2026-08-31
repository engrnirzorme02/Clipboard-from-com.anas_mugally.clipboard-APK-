package com.google.android.gms.internal.p409authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p114O2.C1126i;
import p114O2.C1127j;
import p114O2.C1128k;
import p114O2.C1137t;
import p114O2.InterfaceC1122e;
import p177X2.AbstractC1949e;

/* JADX INFO: loaded from: classes2.dex */
public final class zbaj extends AbstractC3559g implements InterfaceC1122e {
    private static final C3553a.g zba;
    private static final C3553a.a zbb;
    private static final C3553a zbc;
    private final String zbd;

    static {
        C3553a.g gVar = new C3553a.g();
        zba = gVar;
        zbae zbaeVar = new zbae();
        zbb = zbaeVar;
        zbc = new C3553a("Auth.Api.Identity.CredentialSaving.API", zbaeVar, gVar);
    }

    public zbaj(Activity activity, C1137t c1137t) {
        super(activity, zbc, (C3553a.d) c1137t, AbstractC3559g.a.f14540c);
        this.zbd = zbaw.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status;
        return (intent == null || (status = (Status) AbstractC1949e.m8080b(intent, "status", Status.CREATOR)) == null) ? Status.f14515s : status;
    }

    public final Task<C1126i> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        AbstractC3718s.m18083l(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.C3537a c3537aM17672Y = SaveAccountLinkingTokenRequest.m17672Y(saveAccountLinkingTokenRequest);
        c3537aM17672Y.m17682f(this.zbd);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequestM17677a = c3537aM17672Y.m17677a();
        return doRead(AbstractC3632w.m17942a().m17950d(zbav.zbh).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbai
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbg zbgVar = (zbg) obj;
                ((zbm) zbgVar.getService()).zbc(new zbaf(this.zba, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) AbstractC3718s.m18083l(saveAccountLinkingTokenRequestM17677a), zbaz.zba(zbgVar.getContext()));
            }
        }).m17949c(false).m17951e(1535).m17947a());
    }

    @Override // p114O2.InterfaceC1122e
    public final Task<C1128k> savePassword(C1127j c1127j) {
        AbstractC3718s.m18083l(c1127j);
        C1127j.a aVarM4949V = C1127j.m4949V(c1127j);
        aVarM4949V.m4954d(this.zbd);
        final C1127j c1127jM4951a = aVarM4949V.m4951a();
        return doRead(AbstractC3632w.m17942a().m17950d(zbav.zbf).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbah
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbg zbgVar = (zbg) obj;
                ((zbm) zbgVar.getService()).zbd(new zbag(this.zba, (TaskCompletionSource) obj2), (C1127j) AbstractC3718s.m18083l(c1127jM4951a), zbaz.zba(zbgVar.getContext()));
            }
        }).m17949c(false).m17951e(1536).m17947a());
    }

    public zbaj(Context context, C1137t c1137t) {
        super(context, zbc, c1137t, AbstractC3559g.a.f14540c);
        this.zbd = zbaw.zba();
    }
}
