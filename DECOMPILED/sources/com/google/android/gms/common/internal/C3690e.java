package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AbstractC2263x;
import androidx.collection.C2391b;
import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.C3553a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p299m3.C6334a;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3690e {

    /* JADX INFO: renamed from: a */
    private final Account f14750a;

    /* JADX INFO: renamed from: b */
    private final Set f14751b;

    /* JADX INFO: renamed from: c */
    private final Set f14752c;

    /* JADX INFO: renamed from: d */
    private final Map f14753d;

    /* JADX INFO: renamed from: e */
    private final int f14754e;

    /* JADX INFO: renamed from: f */
    private final View f14755f;

    /* JADX INFO: renamed from: g */
    private final String f14756g;

    /* JADX INFO: renamed from: h */
    private final String f14757h;

    /* JADX INFO: renamed from: i */
    private final C6334a f14758i;

    /* JADX INFO: renamed from: j */
    private Integer f14759j;

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Account f14760a;

        /* JADX INFO: renamed from: b */
        private C2391b f14761b;

        /* JADX INFO: renamed from: c */
        private String f14762c;

        /* JADX INFO: renamed from: d */
        private String f14763d;

        /* JADX INFO: renamed from: e */
        private final C6334a f14764e = C6334a.f24166u;

        /* JADX INFO: renamed from: a */
        public C3690e m18016a() {
            return new C3690e(this.f14760a, this.f14761b, null, 0, null, this.f14762c, this.f14763d, this.f14764e, false);
        }

        /* JADX INFO: renamed from: b */
        public a m18017b(String str) {
            this.f14762c = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public final a m18018c(Collection collection) {
            if (this.f14761b == null) {
                this.f14761b = new C2391b();
            }
            this.f14761b.addAll(collection);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final a m18019d(Account account) {
            this.f14760a = account;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public final a m18020e(String str) {
            this.f14763d = str;
            return this;
        }
    }

    public C3690e(Account account, Set set, Map map, int i7, View view, String str, String str2, C6334a c6334a, boolean z7) {
        this.f14750a = account;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f14751b = setUnmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f14753d = map;
        this.f14755f = view;
        this.f14754e = i7;
        this.f14756g = str;
        this.f14757h = str2;
        this.f14758i = c6334a == null ? C6334a.f24166u : c6334a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            AbstractC2263x.m9328a(it.next());
            throw null;
        }
        this.f14752c = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: a */
    public static C3690e m18004a(Context context) {
        return new AbstractC3560h.a(context).m17778a();
    }

    /* JADX INFO: renamed from: b */
    public Account m18005b() {
        return this.f14750a;
    }

    /* JADX INFO: renamed from: c */
    public String m18006c() {
        Account account = this.f14750a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public Account m18007d() {
        Account account = this.f14750a;
        return account != null ? account : new Account(AbstractC3686c.DEFAULT_ACCOUNT, "com.google");
    }

    /* JADX INFO: renamed from: e */
    public Set m18008e() {
        return this.f14752c;
    }

    /* JADX INFO: renamed from: f */
    public Set m18009f(C3553a c3553a) {
        AbstractC2263x.m9328a(this.f14753d.get(c3553a));
        return this.f14751b;
    }

    /* JADX INFO: renamed from: g */
    public String m18010g() {
        return this.f14756g;
    }

    /* JADX INFO: renamed from: h */
    public Set m18011h() {
        return this.f14751b;
    }

    /* JADX INFO: renamed from: i */
    public final C6334a m18012i() {
        return this.f14758i;
    }

    /* JADX INFO: renamed from: j */
    public final Integer m18013j() {
        return this.f14759j;
    }

    /* JADX INFO: renamed from: k */
    public final String m18014k() {
        return this.f14757h;
    }

    /* JADX INFO: renamed from: l */
    public final void m18015l(Integer num) {
        this.f14759j = num;
    }
}
