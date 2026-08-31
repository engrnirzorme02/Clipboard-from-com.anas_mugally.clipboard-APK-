package p010B0;

import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: B0.e */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC0046e {
    /* JADX INFO: renamed from: a */
    public static final Void m184a(String key) {
        AbstractC6118n.m27187e(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }
}
