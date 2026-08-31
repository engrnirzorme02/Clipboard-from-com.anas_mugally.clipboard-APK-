package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.protobuf.C */
/* JADX INFO: loaded from: classes.dex */
public class C5065C extends IOException {

    /* JADX INFO: renamed from: a */
    private InterfaceC5082U f19302a;

    /* JADX INFO: renamed from: b */
    private boolean f19303b;

    /* JADX INFO: renamed from: com.google.protobuf.C$a */
    public static class a extends C5065C {
        public a(String str) {
            super(str);
        }
    }

    public C5065C(String str) {
        super(str);
        this.f19302a = null;
    }

    /* JADX INFO: renamed from: b */
    static C5065C m22891b() {
        return new C5065C("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    static C5065C m22892c() {
        return new C5065C("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    static C5065C m22893d() {
        return new C5065C("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    static a m22894e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    static C5065C m22895f() {
        return new C5065C("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    static C5065C m22896g() {
        return new C5065C("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    static C5065C m22897h() {
        return new C5065C("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: i */
    static C5065C m22898i() {
        return new C5065C("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: l */
    static C5065C m22899l() {
        return new C5065C("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: m */
    static C5065C m22900m() {
        return new C5065C("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    boolean m22901a() {
        return this.f19303b;
    }

    /* JADX INFO: renamed from: j */
    void m22902j() {
        this.f19303b = true;
    }

    /* JADX INFO: renamed from: k */
    public C5065C m22903k(InterfaceC5082U interfaceC5082U) {
        this.f19302a = interfaceC5082U;
        return this;
    }

    public C5065C(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f19302a = null;
    }
}
