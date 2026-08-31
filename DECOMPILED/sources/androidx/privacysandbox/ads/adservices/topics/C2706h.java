package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1638q;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2706h {

    /* JADX INFO: renamed from: a */
    private final List f10650a;

    /* JADX INFO: renamed from: b */
    private final List f10651b;

    public C2706h(List topics, List encryptedTopics) {
        AbstractC6118n.m27187e(topics, "topics");
        AbstractC6118n.m27187e(encryptedTopics, "encryptedTopics");
        this.f10650a = topics;
        this.f10651b = encryptedTopics;
    }

    /* JADX INFO: renamed from: a */
    public final List m12819a() {
        return this.f10650a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2706h)) {
            return false;
        }
        C2706h c2706h = (C2706h) obj;
        return this.f10650a.size() == c2706h.f10650a.size() && this.f10651b.size() == c2706h.f10651b.size() && AbstractC6118n.m27183a(new HashSet(this.f10650a), new HashSet(c2706h.f10650a)) && AbstractC6118n.m27183a(new HashSet(this.f10651b), new HashSet(c2706h.f10651b));
    }

    public int hashCode() {
        return Objects.hash(this.f10650a, this.f10651b);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f10650a + ", EncryptedTopics=" + this.f10651b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2706h(List topics) {
        this(topics, AbstractC1638q.m6765j());
        AbstractC6118n.m27187e(topics, "topics");
    }
}
