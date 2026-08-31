package p310n6;

import java.util.concurrent.TimeUnit;
import p187Y5.AbstractC2060b;
import p187Y5.InterfaceC2059a;

/* JADX INFO: renamed from: n6.d */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC6507d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: u */
    private static final /* synthetic */ InterfaceC2059a f24620u = AbstractC2060b.m8524a(m27725c());

    /* JADX INFO: renamed from: a */
    private final TimeUnit f24621a;

    EnumC6507d(TimeUnit timeUnit) {
        this.f24621a = timeUnit;
    }

    /* JADX INFO: renamed from: d */
    public final TimeUnit m27726d() {
        return this.f24621a;
    }
}
