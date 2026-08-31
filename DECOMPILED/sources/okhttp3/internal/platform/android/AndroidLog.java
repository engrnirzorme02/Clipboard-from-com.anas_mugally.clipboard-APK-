package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC6118n;
import okhttp3.OkHttpClient;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2;
import p152T5.AbstractC1610H;
import p302m6.AbstractC6406h;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidLog {

    /* JADX INFO: renamed from: a */
    public static final AndroidLog f26013a = new AndroidLog();

    /* JADX INFO: renamed from: b */
    private static final CopyOnWriteArraySet f26014b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c */
    private static final Map f26015c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r7 = OkHttpClient.class.getPackage();
        String name = r7 != null ? r7.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = OkHttpClient.class.getName();
        AbstractC6118n.m27186d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = Http2.class.getName();
        AbstractC6118n.m27186d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = TaskRunner.class.getName();
        AbstractC6118n.m27186d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f26015c = AbstractC1610H.m6636r(linkedHashMap);
    }

    private AndroidLog() {
    }

    /* JADX INFO: renamed from: c */
    private final void m29402c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f26014b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(AndroidLogHandler.f26016a);
        }
    }

    /* JADX INFO: renamed from: d */
    private final String m29403d(String str) {
        String str2 = (String) f26015c.get(str);
        return str2 == null ? AbstractC6406h.m27630V0(str, 23) : str2;
    }

    /* JADX INFO: renamed from: a */
    public final void m29404a(String loggerName, int i7, String message, Throwable th) {
        int iMin;
        AbstractC6118n.m27187e(loggerName, "loggerName");
        AbstractC6118n.m27187e(message, "message");
        String strM29403d = m29403d(loggerName);
        if (Log.isLoggable(strM29403d, i7)) {
            if (th != null) {
                message = message + '\n' + Log.getStackTraceString(th);
            }
            String str = message;
            int length = str.length();
            int i8 = 0;
            while (i8 < length) {
                int iZ = AbstractC6406h.m27601Z(str, '\n', i8, false, 4, null);
                if (iZ == -1) {
                    iZ = length;
                }
                while (true) {
                    iMin = Math.min(iZ, i8 + 4000);
                    String strSubstring = str.substring(i8, iMin);
                    AbstractC6118n.m27186d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i7, strM29403d, strSubstring);
                    if (iMin >= iZ) {
                        break;
                    } else {
                        i8 = iMin;
                    }
                }
                i8 = iMin + 1;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m29405b() {
        for (Map.Entry entry : f26015c.entrySet()) {
            m29402c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
