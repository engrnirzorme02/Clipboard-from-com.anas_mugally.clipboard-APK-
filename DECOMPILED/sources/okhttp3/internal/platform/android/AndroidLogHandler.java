package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidLogHandler extends Handler {

    /* JADX INFO: renamed from: a */
    public static final AndroidLogHandler f26016a = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord record) {
        AbstractC6118n.m27187e(record, "record");
        AndroidLog androidLog = AndroidLog.f26013a;
        String loggerName = record.getLoggerName();
        AbstractC6118n.m27186d(loggerName, "record.loggerName");
        int iM29407b = AndroidLogKt.m29407b(record);
        String message = record.getMessage();
        AbstractC6118n.m27186d(message, "record.message");
        androidLog.m29404a(loggerName, iM29407b, message, record.getThrown());
    }
}
