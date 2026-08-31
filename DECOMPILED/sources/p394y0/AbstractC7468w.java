package p394y0;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p026D0.InterfaceC0180k;
import p145S5.AbstractC1430h;
import p145S5.InterfaceC1429g;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: y0.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7468w {

    /* JADX INFO: renamed from: a */
    private final AbstractC7462q f29994a;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f29995b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1429g f29996c;

    /* JADX INFO: renamed from: y0.w$a */
    static final class a extends AbstractC6119o implements InterfaceC5356a {
        a() {
            super(0);
        }

        @Override // p238e6.InterfaceC5356a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC0180k invoke() {
            return AbstractC7468w.this.m33080d();
        }
    }

    public AbstractC7468w(AbstractC7462q database) {
        AbstractC6118n.m27187e(database, "database");
        this.f29994a = database;
        this.f29995b = new AtomicBoolean(false);
        this.f29996c = AbstractC1430h.m6066b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public final InterfaceC0180k m33080d() {
        return this.f29994a.m33030f(mo7514e());
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC0180k m33081f() {
        return (InterfaceC0180k) this.f29996c.getValue();
    }

    /* JADX INFO: renamed from: g */
    private final InterfaceC0180k m33082g(boolean z7) {
        return z7 ? m33081f() : m33080d();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0180k m33083b() {
        m33084c();
        return m33082g(this.f29995b.compareAndSet(false, true));
    }

    /* JADX INFO: renamed from: c */
    protected void m33084c() {
        this.f29994a.m33027c();
    }

    /* JADX INFO: renamed from: e */
    protected abstract String mo7514e();

    /* JADX INFO: renamed from: h */
    public void m33085h(InterfaceC0180k statement) {
        AbstractC6118n.m27187e(statement, "statement");
        if (statement == m33081f()) {
            this.f29995b.set(false);
        }
    }
}
