package androidx.privacysandbox.ads.adservices.topics;

import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC6118n;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2699a {

    /* JADX INFO: renamed from: a */
    private final byte[] f10642a;

    /* JADX INFO: renamed from: b */
    private final String f10643b;

    /* JADX INFO: renamed from: c */
    private final byte[] f10644c;

    public C2699a(byte[] encryptedTopic, String keyIdentifier, byte[] encapsulatedKey) {
        AbstractC6118n.m27187e(encryptedTopic, "encryptedTopic");
        AbstractC6118n.m27187e(keyIdentifier, "keyIdentifier");
        AbstractC6118n.m27187e(encapsulatedKey, "encapsulatedKey");
        this.f10642a = encryptedTopic;
        this.f10643b = keyIdentifier;
        this.f10644c = encapsulatedKey;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2699a)) {
            return false;
        }
        C2699a c2699a = (C2699a) obj;
        return Arrays.equals(this.f10642a, c2699a.f10642a) && this.f10643b.contentEquals(c2699a.f10643b) && Arrays.equals(this.f10644c, c2699a.f10644c);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.f10642a)), this.f10643b, Integer.valueOf(Arrays.hashCode(this.f10644c)));
    }

    public String toString() {
        return "EncryptedTopic { " + ("EncryptedTopic=" + AbstractC6406h.m27560s(this.f10642a) + ", KeyIdentifier=" + this.f10643b + ", EncapsulatedKey=" + AbstractC6406h.m27560s(this.f10644c) + " }");
    }
}
