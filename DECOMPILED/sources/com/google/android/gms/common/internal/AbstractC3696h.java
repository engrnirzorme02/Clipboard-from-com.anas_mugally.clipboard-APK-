package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p170W2.C1839d;
import p170W2.C1840e;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3696h extends AbstractC3686c implements C3553a.f {
    private static volatile Executor zaa;
    private final C3690e zab;
    private final Set zac;
    private final Account zad;

    protected AbstractC3696h(Context context, Looper looper, int i7, C3690e c3690e, AbstractC3560h.b bVar, AbstractC3560h.c cVar) {
        this(context, looper, i7, c3690e, (InterfaceC3598f) bVar, (InterfaceC3616o) cVar);
    }

    /* JADX INFO: renamed from: d */
    private final Set m18030d(Set set) {
        Set<Scope> setValidateScopes = validateScopes(set);
        Iterator<Scope> it = setValidateScopes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setValidateScopes;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    public final Account getAccount() {
        return this.zad;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected Executor getBindServiceExecutor() {
        return null;
    }

    protected final C3690e getClientSettings() {
        return this.zab;
    }

    public C1839d[] getRequiredFeatures() {
        return new C1839d[0];
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c
    protected final Set<Scope> getScopes() {
        return this.zac;
    }

    @Override // com.google.android.gms.common.api.C3553a.f
    public Set<Scope> getScopesForConnectionlessNonSignIn() {
        return requiresSignIn() ? this.zac : Collections.EMPTY_SET;
    }

    protected Set<Scope> validateScopes(Set<Scope> set) {
        return set;
    }

    protected AbstractC3696h(Context context, Looper looper, int i7, C3690e c3690e, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        this(context, looper, AbstractC3698i.m18034a(context), C1840e.m7604n(), i7, c3690e, (InterfaceC3598f) AbstractC3718s.m18083l(interfaceC3598f), (InterfaceC3616o) AbstractC3718s.m18083l(interfaceC3616o));
    }

    protected AbstractC3696h(Context context, Looper looper, AbstractC3698i abstractC3698i, C1840e c1840e, int i7, C3690e c3690e, InterfaceC3598f interfaceC3598f, InterfaceC3616o interfaceC3616o) {
        super(context, looper, abstractC3698i, c1840e, i7, interfaceC3598f == null ? null : new C3665I(interfaceC3598f), interfaceC3616o != null ? new C3666J(interfaceC3616o) : null, c3690e.m18014k());
        this.zab = c3690e;
        this.zad = c3690e.m18005b();
        this.zac = m18030d(c3690e.m18008e());
    }
}
