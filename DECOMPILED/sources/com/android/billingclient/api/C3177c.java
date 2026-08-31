package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.appcompat.app.AbstractC2263x;
import com.google.android.gms.internal.play_billing.zzbg;
import com.google.android.gms.internal.play_billing.zzbt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p403z1.AbstractC7575q;

/* JADX INFO: renamed from: com.android.billingclient.api.c */
/* JADX INFO: loaded from: classes.dex */
public class C3177c {

    /* JADX INFO: renamed from: a */
    private boolean f13543a;

    /* JADX INFO: renamed from: b */
    private String f13544b;

    /* JADX INFO: renamed from: c */
    private String f13545c;

    /* JADX INFO: renamed from: d */
    private c f13546d;

    /* JADX INFO: renamed from: e */
    private zzbt f13547e;

    /* JADX INFO: renamed from: f */
    private ArrayList f13548f;

    /* JADX INFO: renamed from: g */
    private boolean f13549g;

    /* JADX INFO: renamed from: com.android.billingclient.api.c$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f13550a;

        /* JADX INFO: renamed from: b */
        private String f13551b;

        /* JADX INFO: renamed from: c */
        private List f13552c;

        /* JADX INFO: renamed from: d */
        private ArrayList f13553d;

        /* JADX INFO: renamed from: e */
        private boolean f13554e;

        /* JADX INFO: renamed from: f */
        private c.a f13555f;

        /* synthetic */ a(AbstractC7575q abstractC7575q) {
            c.a aVarM16914a = c.m16914a();
            c.a.m16921b(aVarM16914a);
            this.f13555f = aVarM16914a;
        }

        /* JADX INFO: renamed from: a */
        public C3177c m16904a() {
            ArrayList arrayList = this.f13553d;
            boolean z7 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f13552c;
            boolean z8 = (list == null || list.isEmpty()) ? false : true;
            if (!z7 && !z8) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z7 && z8) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            AbstractC7575q abstractC7575q = null;
            if (!z7) {
                List list2 = this.f13552c;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((b) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.f13553d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f13553d.size() > 1) {
                    AbstractC2263x.m9328a(this.f13553d.get(0));
                    throw null;
                }
            }
            C3177c c3177c = new C3177c(abstractC7575q);
            if (z7) {
                AbstractC2263x.m9328a(this.f13553d.get(0));
                throw null;
            }
            c3177c.f13543a = z8 && !((b) this.f13552c.get(0)).m16907b().m16945f().isEmpty();
            c3177c.f13544b = this.f13550a;
            c3177c.f13545c = this.f13551b;
            c3177c.f13546d = this.f13555f.m16922a();
            ArrayList arrayList2 = this.f13553d;
            c3177c.f13548f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            c3177c.f13549g = this.f13554e;
            List list3 = this.f13552c;
            c3177c.f13547e = list3 != null ? zzbt.zzj(list3) : zzbt.zzk();
            return c3177c;
        }

        /* JADX INFO: renamed from: b */
        public a m16905b(List list) {
            this.f13552c = new ArrayList(list);
            return this;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final C3180f f13556a;

        /* JADX INFO: renamed from: b */
        private final String f13557b;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private C3180f f13558a;

            /* JADX INFO: renamed from: b */
            private String f13559b;

            /* synthetic */ a(AbstractC7575q abstractC7575q) {
            }

            /* JADX INFO: renamed from: a */
            public b m16911a() {
                zzbg.zzc(this.f13558a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            /* JADX INFO: renamed from: b */
            public a m16912b(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.f13559b = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            public a m16913c(C3180f c3180f) {
                this.f13558a = c3180f;
                if (c3180f.m16940a() != null) {
                    c3180f.m16940a().getClass();
                    C3180f.b bVarM16940a = c3180f.m16940a();
                    if (bVarM16940a.m16950b() != null) {
                        this.f13559b = bVarM16940a.m16950b();
                    }
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, AbstractC7575q abstractC7575q) {
            this.f13556a = aVar.f13558a;
            this.f13557b = aVar.f13559b;
        }

        /* JADX INFO: renamed from: a */
        public static a m16906a() {
            return new a(null);
        }

        /* JADX INFO: renamed from: b */
        public final C3180f m16907b() {
            return this.f13556a;
        }

        /* JADX INFO: renamed from: c */
        public final String m16908c() {
            return this.f13557b;
        }
    }

    /* JADX INFO: renamed from: com.android.billingclient.api.c$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        private String f13560a;

        /* JADX INFO: renamed from: b */
        private String f13561b;

        /* JADX INFO: renamed from: c */
        private int f13562c = 0;

        /* JADX INFO: renamed from: com.android.billingclient.api.c$c$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private String f13563a;

            /* JADX INFO: renamed from: b */
            private String f13564b;

            /* JADX INFO: renamed from: c */
            private boolean f13565c;

            /* JADX INFO: renamed from: d */
            private int f13566d = 0;

            /* synthetic */ a(AbstractC7575q abstractC7575q) {
            }

            /* JADX INFO: renamed from: b */
            static /* synthetic */ a m16921b(a aVar) {
                aVar.f13565c = true;
                return aVar;
            }

            /* JADX INFO: renamed from: a */
            public c m16922a() {
                boolean z7 = true;
                AbstractC7575q abstractC7575q = null;
                if (TextUtils.isEmpty(this.f13563a) && TextUtils.isEmpty(null)) {
                    z7 = false;
                }
                boolean zIsEmpty = TextUtils.isEmpty(this.f13564b);
                if (z7 && !zIsEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f13565c && !z7 && zIsEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                c cVar = new c(abstractC7575q);
                cVar.f13560a = this.f13563a;
                cVar.f13562c = this.f13566d;
                cVar.f13561b = this.f13564b;
                return cVar;
            }
        }

        /* synthetic */ c(AbstractC7575q abstractC7575q) {
        }

        /* JADX INFO: renamed from: a */
        public static a m16914a() {
            return new a(null);
        }

        /* JADX INFO: renamed from: b */
        final int m16918b() {
            return this.f13562c;
        }

        /* JADX INFO: renamed from: c */
        final String m16919c() {
            return this.f13560a;
        }

        /* JADX INFO: renamed from: d */
        final String m16920d() {
            return this.f13561b;
        }
    }

    /* synthetic */ C3177c(AbstractC7575q abstractC7575q) {
    }

    /* JADX INFO: renamed from: a */
    public static a m16883a() {
        return new a(null);
    }

    /* JADX INFO: renamed from: b */
    public int m16891b() {
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m16892c() {
        return this.f13546d.m16918b();
    }

    /* JADX INFO: renamed from: d */
    public long m16893d() {
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    final C3178d m16894e() {
        C3180f.b bVar;
        if (this.f13547e.isEmpty()) {
            return AbstractC3163K.f13441i;
        }
        b bVar2 = (b) this.f13547e.get(0);
        for (int i7 = 1; i7 < this.f13547e.size(); i7++) {
            b bVar3 = (b) this.f13547e.get(i7);
            if (!bVar3.m16907b().m16943d().equals(bVar2.m16907b().m16943d()) && !bVar3.m16907b().m16943d().equals("play_pass_subs")) {
                return AbstractC3163K.m16775a(5, "All products should have same ProductType.");
            }
        }
        String strM16945f = bVar2.m16907b().m16945f();
        HashMap map = new HashMap();
        HashSet<String> hashSet = new HashSet();
        zzbt zzbtVar = this.f13547e;
        int size = zzbtVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar4 = (b) zzbtVar.get(i8);
            if (bVar4.m16907b().m16944e() != null && bVar4.m16908c() == null) {
                return AbstractC3163K.m16775a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar4.m16907b().m16942c()));
            }
            if (map.containsKey(bVar4.m16907b().m16942c())) {
                return AbstractC3163K.m16775a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar4.m16907b().m16942c()));
            }
            map.put(bVar4.m16907b().m16942c(), bVar4);
            if (!bVar2.m16907b().m16943d().equals("play_pass_subs") && !bVar4.m16907b().m16943d().equals("play_pass_subs") && !strM16945f.equals(bVar4.m16907b().m16945f())) {
                return AbstractC3163K.m16775a(5, "All products must have the same package name.");
            }
        }
        for (String str : hashSet) {
            if (map.containsKey(str)) {
                return AbstractC3163K.m16775a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List listM16941b = bVar2.m16907b().m16941b();
        String strM16908c = bVar2.m16908c();
        if (strM16908c != null && listM16941b != null) {
            Iterator it = listM16941b.iterator();
            do {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (C3180f.b) it.next();
            } while (!strM16908c.equals(bVar.m16950b()));
            if (bVar != null && bVar.m16952d() != null) {
                return AbstractC3163K.m16775a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return AbstractC3163K.f13441i;
    }

    /* JADX INFO: renamed from: f */
    public final String m16895f() {
        return this.f13544b;
    }

    /* JADX INFO: renamed from: g */
    public final String m16896g() {
        return this.f13545c;
    }

    /* JADX INFO: renamed from: h */
    public String m16897h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m16898i() {
        return this.f13546d.m16919c();
    }

    /* JADX INFO: renamed from: j */
    public final String m16899j() {
        return this.f13546d.m16920d();
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m16900k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f13548f);
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List m16901l() {
        return this.f13547e;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16902t() {
        return this.f13549g;
    }

    /* JADX INFO: renamed from: u */
    final boolean m16903u() {
        if (this.f13544b != null || this.f13545c != null || this.f13546d.m16920d() != null || this.f13546d.m16918b() != 0 || this.f13543a || this.f13549g) {
            return true;
        }
        zzbt zzbtVar = this.f13547e;
        if (zzbtVar != null) {
            int size = zzbtVar.size();
            for (int i7 = 0; i7 < size; i7++) {
            }
        }
        return false;
    }
}
