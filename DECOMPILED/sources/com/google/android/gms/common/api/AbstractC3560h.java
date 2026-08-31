package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.collection.C2390a;
import com.google.android.gms.common.api.internal.AbstractC3594d;
import com.google.android.gms.common.api.internal.InterfaceC3598f;
import com.google.android.gms.common.api.internal.InterfaceC3616o;
import com.google.android.gms.common.api.internal.InterfaceC3624s;
import com.google.android.gms.common.internal.C3690e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p170W2.C1840e;
import p299m3.AbstractC6337d;
import p299m3.C6334a;

/* JADX INFO: renamed from: com.google.android.gms.common.api.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3560h {

    /* JADX INFO: renamed from: a */
    private static final Set f14545a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: com.google.android.gms.common.api.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Account f14546a;

        /* JADX INFO: renamed from: d */
        private int f14549d;

        /* JADX INFO: renamed from: e */
        private View f14550e;

        /* JADX INFO: renamed from: f */
        private String f14551f;

        /* JADX INFO: renamed from: g */
        private String f14552g;

        /* JADX INFO: renamed from: i */
        private final Context f14554i;

        /* JADX INFO: renamed from: l */
        private Looper f14557l;

        /* JADX INFO: renamed from: b */
        private final Set f14547b = new HashSet();

        /* JADX INFO: renamed from: c */
        private final Set f14548c = new HashSet();

        /* JADX INFO: renamed from: h */
        private final Map f14553h = new C2390a();

        /* JADX INFO: renamed from: j */
        private final Map f14555j = new C2390a();

        /* JADX INFO: renamed from: k */
        private int f14556k = -1;

        /* JADX INFO: renamed from: m */
        private C1840e f14558m = C1840e.m7604n();

        /* JADX INFO: renamed from: n */
        private C3553a.a f14559n = AbstractC6337d.f24178c;

        /* JADX INFO: renamed from: o */
        private final ArrayList f14560o = new ArrayList();

        /* JADX INFO: renamed from: p */
        private final ArrayList f14561p = new ArrayList();

        public a(Context context) {
            this.f14554i = context;
            this.f14557l = context.getMainLooper();
            this.f14551f = context.getPackageName();
            this.f14552g = context.getClass().getName();
        }

        /* JADX INFO: renamed from: a */
        public final C3690e m17778a() {
            C6334a c6334a = C6334a.f24166u;
            Map map = this.f14555j;
            C3553a c3553a = AbstractC6337d.f24182g;
            if (map.containsKey(c3553a)) {
                c6334a = (C6334a) this.f14555j.get(c3553a);
            }
            return new C3690e(this.f14546a, this.f14547b, this.f14553h, this.f14549d, this.f14550e, this.f14551f, this.f14552g, c6334a, false);
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.h$b */
    public interface b extends InterfaceC3598f {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.api.h$c */
    public interface c extends InterfaceC3616o {
    }

    /* JADX INFO: renamed from: c */
    public static Set m17770c() {
        Set set = f14545a;
        synchronized (set) {
        }
        return set;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC3594d mo17771a(AbstractC3594d abstractC3594d);

    /* JADX INFO: renamed from: b */
    public abstract AbstractC3594d mo17772b(AbstractC3594d abstractC3594d);

    /* JADX INFO: renamed from: d */
    public C3553a.f m17773d(C3553a.c cVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public abstract Context mo17774e();

    /* JADX INFO: renamed from: f */
    public abstract Looper mo17775f();

    /* JADX INFO: renamed from: g */
    public boolean m17776g(InterfaceC3624s interfaceC3624s) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: h */
    public void m17777h() {
        throw new UnsupportedOperationException();
    }
}
