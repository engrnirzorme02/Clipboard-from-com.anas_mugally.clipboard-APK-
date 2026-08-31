package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p404z2.AbstractC7599p;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3364l1 {

    /* JADX INFO: renamed from: g */
    private String f13992g;

    /* JADX INFO: renamed from: i */
    private String f13994i;

    /* JADX INFO: renamed from: j */
    private String f13995j;

    /* JADX INFO: renamed from: l */
    private boolean f13997l;

    /* JADX INFO: renamed from: m */
    private String f13998m;

    /* JADX INFO: renamed from: o */
    private long f14000o;

    /* JADX INFO: renamed from: a */
    private final HashSet f13986a = new HashSet();

    /* JADX INFO: renamed from: b */
    private final Bundle f13987b = new Bundle();

    /* JADX INFO: renamed from: c */
    private final HashMap f13988c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final HashSet f13989d = new HashSet();

    /* JADX INFO: renamed from: e */
    private final Bundle f13990e = new Bundle();

    /* JADX INFO: renamed from: f */
    private final HashSet f13991f = new HashSet();

    /* JADX INFO: renamed from: h */
    private final List f13993h = new ArrayList();

    /* JADX INFO: renamed from: k */
    private int f13996k = -1;

    /* JADX INFO: renamed from: n */
    private int f13999n = 60000;

    /* JADX INFO: renamed from: A */
    final /* synthetic */ String m17242A() {
        return this.f13994i;
    }

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String m17243a() {
        return this.f13995j;
    }

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int m17244b() {
        return this.f13996k;
    }

    /* JADX INFO: renamed from: c */
    final /* synthetic */ boolean m17245c() {
        return this.f13997l;
    }

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String m17246d() {
        return this.f13998m;
    }

    /* JADX INFO: renamed from: e */
    final /* synthetic */ int m17247e() {
        return this.f13999n;
    }

    /* JADX INFO: renamed from: f */
    final /* synthetic */ long m17248f() {
        return this.f14000o;
    }

    /* JADX INFO: renamed from: g */
    public final void m17249g(String str) {
        this.f13986a.add(str);
    }

    /* JADX INFO: renamed from: h */
    public final void m17250h(Class cls, Bundle bundle) {
        this.f13987b.putBundle(cls.getName(), bundle);
    }

    /* JADX INFO: renamed from: i */
    public final void m17251i(String str) {
        this.f13989d.add(str);
    }

    /* JADX INFO: renamed from: j */
    public final void m17252j(String str) {
        this.f13989d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    /* JADX INFO: renamed from: k */
    public final void m17253k(String str) {
        this.f13992g = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m17254l(List list) {
        List list2 = this.f13993h;
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (TextUtils.isEmpty(str)) {
                AbstractC7599p.m33331f("neighboring content URL should not be null or empty");
            } else {
                list2.add(str);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m17255m(String str) {
        this.f13994i = str;
    }

    /* JADX INFO: renamed from: n */
    public final void m17256n(String str) {
        this.f13995j = str;
    }

    /* JADX INFO: renamed from: o */
    public final void m17257o(boolean z7) {
        this.f13996k = z7 ? 1 : 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m17258p(String str, String str2) {
        this.f13990e.putString(str, str2);
    }

    /* JADX INFO: renamed from: q */
    public final void m17259q(String str) {
        this.f13991f.add(str);
    }

    /* JADX INFO: renamed from: r */
    public final void m17260r(boolean z7) {
        this.f13997l = z7;
    }

    /* JADX INFO: renamed from: s */
    final /* synthetic */ HashSet m17261s() {
        return this.f13986a;
    }

    /* JADX INFO: renamed from: t */
    final /* synthetic */ Bundle m17262t() {
        return this.f13987b;
    }

    /* JADX INFO: renamed from: u */
    final /* synthetic */ HashMap m17263u() {
        return this.f13988c;
    }

    /* JADX INFO: renamed from: v */
    final /* synthetic */ HashSet m17264v() {
        return this.f13989d;
    }

    /* JADX INFO: renamed from: w */
    final /* synthetic */ Bundle m17265w() {
        return this.f13990e;
    }

    /* JADX INFO: renamed from: x */
    final /* synthetic */ HashSet m17266x() {
        return this.f13991f;
    }

    /* JADX INFO: renamed from: y */
    final /* synthetic */ String m17267y() {
        return this.f13992g;
    }

    /* JADX INFO: renamed from: z */
    final /* synthetic */ List m17268z() {
        return this.f13993h;
    }
}
