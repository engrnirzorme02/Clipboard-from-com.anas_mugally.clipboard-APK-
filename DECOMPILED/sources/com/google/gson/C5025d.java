package com.google.gson;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.gson.d */
/* JADX INFO: loaded from: classes.dex */
public class C5025d {

    /* JADX INFO: renamed from: d */
    public static final C5025d f19044d = new C5025d("", "", false);

    /* JADX INFO: renamed from: e */
    public static final C5025d f19045e = new C5025d("\n", "  ", true);

    /* JADX INFO: renamed from: a */
    private final String f19046a;

    /* JADX INFO: renamed from: b */
    private final String f19047b;

    /* JADX INFO: renamed from: c */
    private final boolean f19048c;

    private C5025d(String str, String str2, boolean z7) {
        Objects.requireNonNull(str, "newline == null");
        Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f19046a = str;
        this.f19047b = str2;
        this.f19048c = z7;
    }

    /* JADX INFO: renamed from: a */
    public String m22609a() {
        return this.f19047b;
    }

    /* JADX INFO: renamed from: b */
    public String m22610b() {
        return this.f19046a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m22611c() {
        return this.f19048c;
    }
}
