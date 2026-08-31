package p394y0;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: y0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7463r {

    /* JADX INFO: renamed from: a */
    public static final C7463r f29963a = new C7463r();

    private C7463r() {
    }

    /* JADX INFO: renamed from: a */
    public static final String m33063a(String hash) {
        AbstractC6118n.m27187e(hash, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')";
    }
}
