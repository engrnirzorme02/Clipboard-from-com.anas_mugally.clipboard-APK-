package com.google.android.gms.internal.p409authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.C3554b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.C3600g;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import p114O2.C1116E;
import p114O2.C1119b;
import p114O2.C1120c;
import p114O2.C1123f;
import p114O2.C1124g;
import p114O2.C1130m;
import p114O2.InterfaceC1129l;
import p170W2.C1839d;
import p177X2.AbstractC1949e;

/* JADX INFO: loaded from: classes2.dex */
public final class zbat extends AbstractC3559g implements InterfaceC1129l {
    private static final C3553a.g zba;
    private static final C3553a.a zbb;
    private static final C3553a zbc;
    private final String zbd;

    static {
        C3553a.g gVar = new C3553a.g();
        zba = gVar;
        zbak zbakVar = new zbak();
        zbb = zbakVar;
        zbc = new C3553a("Auth.Api.Identity.SignIn.API", zbakVar, gVar);
    }

    public zbat(Activity activity, C1116E c1116e) {
        super(activity, zbc, (C3553a.d) c1116e, AbstractC3559g.a.f14540c);
        this.zbd = zbaw.zba();
    }

    @Override // p114O2.InterfaceC1129l
    public final Task<C1120c> beginSignIn(C1119b c1119b) {
        AbstractC3718s.m18083l(c1119b);
        C1119b.a aVarM4885a0 = C1119b.m4885a0(c1119b);
        aVarM4885a0.m4899h(this.zbd);
        final C1119b c1119bM4892a = aVarM4885a0.m4892a();
        return doRead(AbstractC3632w.m17942a().m17950d(new C1839d("auth_api_credentials_begin_sign_in", 8L)).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbau zbauVar = (zbau) obj;
                ((zbv) zbauVar.getService()).zbc(new zbal(this.zba, (TaskCompletionSource) obj2), (C1119b) AbstractC3718s.m18083l(c1119bM4892a), zbaz.zba(zbauVar.getContext()));
            }
        }).m17949c(false).m17951e(1553).m17947a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws C3554b {
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
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new C3554b(Status.f14515s);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final C1123f c1123f) {
        AbstractC3718s.m18083l(c1123f);
        return doRead(AbstractC3632w.m17942a().m17950d(zbav.zbi).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                this.zba.zbb(c1123f, (zbau) obj, (TaskCompletionSource) obj2);
            }
        }).m17951e(1653).m17947a());
    }

    public final C1130m getSignInCredentialFromIntent(Intent intent) throws C3554b {
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
        C1130m c1130m = (C1130m) AbstractC1949e.m8080b(intent, "sign_in_credential", C1130m.CREATOR);
        if (c1130m != null) {
            return c1130m;
        }
        throw new C3554b(Status.f14515s);
    }

    @Override // p114O2.InterfaceC1129l
    public final Task<PendingIntent> getSignInIntent(C1124g c1124g) {
        AbstractC3718s.m18083l(c1124g);
        C1124g.a aVarM4931Z = C1124g.m4931Z(c1124g);
        aVarM4931Z.m4943g(this.zbd);
        final C1124g c1124gM4937a = aVarM4931Z.m4937a();
        return doRead(AbstractC3632w.m17942a().m17950d(zbav.zbg).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbaq
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                zbau zbauVar = (zbau) obj;
                ((zbv) zbauVar.getService()).zbe(new zban(this.zba, (TaskCompletionSource) obj2), (C1124g) AbstractC3718s.m18083l(c1124gM4937a), zbaz.zba(zbauVar.getContext()));
            }
        }).m17951e(1555).m17947a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Iterator it = AbstractC3560h.m17770c().iterator();
        while (it.hasNext()) {
            ((AbstractC3560h) it.next()).m17777h();
        }
        C3600g.m17872a();
        return doWrite(AbstractC3632w.m17942a().m17950d(zbav.zbb).m17948b(new InterfaceC3622r() { // from class: com.google.android.gms.internal.auth-api.zbap
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                this.zba.zba((zbau) obj, (TaskCompletionSource) obj2);
            }
        }).m17949c(false).m17951e(1554).m17947a());
    }

    final /* synthetic */ void zba(zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbam zbamVar = new zbam(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbd(zbamVar, this.zbd, zbaz.zba(zbauVar.getContext()));
    }

    final /* synthetic */ void zbb(C1123f c1123f, zbau zbauVar, TaskCompletionSource taskCompletionSource) {
        zbao zbaoVar = new zbao(this, taskCompletionSource);
        ((zbv) zbauVar.getService()).zbf(zbaoVar, c1123f, this.zbd, zbaz.zba(zbauVar.getContext()));
    }

    public zbat(Context context, C1116E c1116e) {
        super(context, zbc, c1116e, AbstractC3559g.a.f14540c);
        this.zbd = zbaw.zba();
    }
}
