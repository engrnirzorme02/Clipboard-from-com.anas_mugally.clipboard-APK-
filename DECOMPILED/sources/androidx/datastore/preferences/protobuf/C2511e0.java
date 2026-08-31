package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C2511e0 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final List f9509a;

    public C2511e0(InterfaceC2486J interfaceC2486J) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f9509a = null;
    }

    /* JADX INFO: renamed from: a */
    public C2535v m11136a() {
        return new C2535v(getMessage());
    }
}
