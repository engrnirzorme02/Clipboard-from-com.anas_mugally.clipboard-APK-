package p301m5;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: m5.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6373a0 implements InterfaceC6371Z {

    /* JADX INFO: renamed from: a */
    public static final C6373a0 f24329a = new C6373a0();

    private C6373a0() {
    }

    @Override // p301m5.InterfaceC6371Z
    public UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC6118n.m27186d(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
