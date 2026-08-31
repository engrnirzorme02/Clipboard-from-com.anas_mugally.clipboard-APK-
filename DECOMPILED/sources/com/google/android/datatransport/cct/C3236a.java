package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p198a2.C2187c;
import p216c2.InterfaceC2991g;

/* JADX INFO: renamed from: com.google.android.datatransport.cct.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3236a implements InterfaceC2991g {

    /* JADX INFO: renamed from: c */
    static final String f13841c;

    /* JADX INFO: renamed from: d */
    static final String f13842d;

    /* JADX INFO: renamed from: e */
    private static final String f13843e;

    /* JADX INFO: renamed from: f */
    private static final Set f13844f;

    /* JADX INFO: renamed from: g */
    public static final C3236a f13845g;

    /* JADX INFO: renamed from: h */
    public static final C3236a f13846h;

    /* JADX INFO: renamed from: a */
    private final String f13847a;

    /* JADX INFO: renamed from: b */
    private final String f13848b;

    static {
        String strM17163a = AbstractC3240e.m17163a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f13841c = strM17163a;
        String strM17163a2 = AbstractC3240e.m17163a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f13842d = strM17163a2;
        String strM17163a3 = AbstractC3240e.m17163a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f13843e = strM17163a3;
        f13844f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C2187c.m8925b("proto"), C2187c.m8925b("json"))));
        f13845g = new C3236a(strM17163a, null);
        f13846h = new C3236a(strM17163a2, strM17163a3);
    }

    public C3236a(String str, String str2) {
        this.f13847a = str;
        this.f13848b = str2;
    }

    /* JADX INFO: renamed from: c */
    public static C3236a m17143c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C3236a(str2, str3);
    }

    @Override // p216c2.InterfaceC2991g
    /* JADX INFO: renamed from: a */
    public Set mo14943a() {
        return f13844f;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m17144b() {
        String str = this.f13848b;
        if (str == null && this.f13847a == null) {
            return null;
        }
        String str2 = this.f13847a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    /* JADX INFO: renamed from: d */
    public String m17145d() {
        return this.f13848b;
    }

    /* JADX INFO: renamed from: e */
    public String m17146e() {
        return this.f13847a;
    }

    @Override // p216c2.InterfaceC2990f
    public byte[] getExtras() {
        return m17144b();
    }

    @Override // p216c2.InterfaceC2990f
    public String getName() {
        return "cct";
    }
}
