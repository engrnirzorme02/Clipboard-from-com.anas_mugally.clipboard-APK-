package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v */
/* JADX INFO: loaded from: classes.dex */
public class C2535v extends IOException {

    /* JADX INFO: renamed from: a */
    private InterfaceC2486J f9729a;

    /* JADX INFO: renamed from: b */
    private boolean f9730b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C2535v {
        public a(String str) {
            super(str);
        }
    }

    public C2535v(String str) {
        super(str);
        this.f9729a = null;
    }

    /* JADX INFO: renamed from: b */
    static C2535v m11645b() {
        return new C2535v("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: renamed from: c */
    static C2535v m11646c() {
        return new C2535v("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: renamed from: d */
    static C2535v m11647d() {
        return new C2535v("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: e */
    static a m11648e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: renamed from: f */
    static C2535v m11649f() {
        return new C2535v("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: g */
    static C2535v m11650g() {
        return new C2535v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: h */
    static C2535v m11651h() {
        return new C2535v("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: i */
    static C2535v m11652i() {
        return new C2535v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: l */
    static C2535v m11653l() {
        return new C2535v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: renamed from: m */
    static C2535v m11654m() {
        return new C2535v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    boolean m11655a() {
        return this.f9730b;
    }

    /* JADX INFO: renamed from: j */
    void m11656j() {
        this.f9730b = true;
    }

    /* JADX INFO: renamed from: k */
    public C2535v m11657k(InterfaceC2486J interfaceC2486J) {
        this.f9729a = interfaceC2486J;
        return this;
    }

    public C2535v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f9729a = null;
    }
}
