package p274j2;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p198a2.EnumC2190f;
import p298m2.InterfaceC6328a;

/* JADX INFO: renamed from: j2.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5843f {

    /* JADX INFO: renamed from: j2.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private InterfaceC6328a f22977a;

        /* JADX INFO: renamed from: b */
        private Map f22978b = new HashMap();

        /* JADX INFO: renamed from: a */
        public a m26250a(EnumC2190f enumC2190f, b bVar) {
            this.f22978b.put(enumC2190f, bVar);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public AbstractC5843f m26251b() {
            if (this.f22977a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f22978b.keySet().size() < EnumC2190f.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f22978b;
            this.f22978b = new HashMap();
            return AbstractC5843f.m26244d(this.f22977a, map);
        }

        /* JADX INFO: renamed from: c */
        public a m26252c(InterfaceC6328a interfaceC6328a) {
            this.f22977a = interfaceC6328a;
            return this;
        }
    }

    /* JADX INFO: renamed from: j2.f$b */
    public static abstract class b {

        /* JADX INFO: renamed from: j2.f$b$a */
        public static abstract class a {
            /* JADX INFO: renamed from: a */
            public abstract b mo26234a();

            /* JADX INFO: renamed from: b */
            public abstract a mo26235b(long j7);

            /* JADX INFO: renamed from: c */
            public abstract a mo26236c(Set set);

            /* JADX INFO: renamed from: d */
            public abstract a mo26237d(long j7);
        }

        /* JADX INFO: renamed from: a */
        public static a m26253a() {
            return new C5840c.b().mo26236c(Collections.EMPTY_SET);
        }

        /* JADX INFO: renamed from: b */
        abstract long mo26231b();

        /* JADX INFO: renamed from: c */
        abstract Set mo26232c();

        /* JADX INFO: renamed from: d */
        abstract long mo26233d();
    }

    /* JADX INFO: renamed from: j2.f$c */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* JADX INFO: renamed from: a */
    private long m26242a(int i7, long j7) {
        int i8 = i7 - 1;
        return (long) (Math.pow(3.0d, i8) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * ((long) i8))));
    }

    /* JADX INFO: renamed from: b */
    public static a m26243b() {
        return new a();
    }

    /* JADX INFO: renamed from: d */
    static AbstractC5843f m26244d(InterfaceC6328a interfaceC6328a, Map map) {
        return new C5839b(interfaceC6328a, map);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC5843f m26245f(InterfaceC6328a interfaceC6328a) {
        return m26243b().m26250a(EnumC2190f.DEFAULT, b.m26253a().mo26235b(30000L).mo26237d(86400000L).mo26234a()).m26250a(EnumC2190f.HIGHEST, b.m26253a().mo26235b(1000L).mo26237d(86400000L).mo26234a()).m26250a(EnumC2190f.VERY_LOW, b.m26253a().mo26235b(86400000L).mo26237d(86400000L).mo26236c(m26246i(c.DEVICE_IDLE)).mo26234a()).m26252c(interfaceC6328a).m26251b();
    }

    /* JADX INFO: renamed from: i */
    private static Set m26246i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    /* JADX INFO: renamed from: j */
    private void m26247j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    /* JADX INFO: renamed from: c */
    public JobInfo.Builder m26248c(JobInfo.Builder builder, EnumC2190f enumC2190f, long j7, int i7) {
        builder.setMinimumLatency(m26249g(enumC2190f, j7, i7));
        m26247j(builder, ((b) mo26230h().get(enumC2190f)).mo26232c());
        return builder;
    }

    /* JADX INFO: renamed from: e */
    abstract InterfaceC6328a mo26229e();

    /* JADX INFO: renamed from: g */
    public long m26249g(EnumC2190f enumC2190f, long j7, int i7) {
        long jMo27283a = j7 - mo26229e().mo27283a();
        b bVar = (b) mo26230h().get(enumC2190f);
        return Math.min(Math.max(m26242a(i7, bVar.mo26231b()), jMo27283a), bVar.mo26233d());
    }

    /* JADX INFO: renamed from: h */
    abstract Map mo26230h();
}
