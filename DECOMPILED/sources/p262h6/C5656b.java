package p262h6;

import java.util.Random;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: h6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5656b extends AbstractC5655a {

    /* JADX INFO: renamed from: c */
    private final a f21644c = new a();

    /* JADX INFO: renamed from: h6.b$a */
    public static final class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p262h6.AbstractC5655a
    /* JADX INFO: renamed from: g */
    public Random mo25166g() {
        Object obj = this.f21644c.get();
        AbstractC6118n.m27186d(obj, "get(...)");
        return (Random) obj;
    }
}
