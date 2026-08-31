package p002A0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0176g;
import p026D0.InterfaceC0179j;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p220c6.AbstractC3026b;
import p302m6.AbstractC6406h;
import p394y0.AbstractC7462q;

/* JADX INFO: renamed from: A0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0004b {
    /* JADX INFO: renamed from: a */
    public static final void m4a(InterfaceC0176g db) throws IOException {
        AbstractC6118n.m27187e(db, "db");
        List listC = AbstractC1638q.m6758c();
        Cursor cursorMo881a0 = db.mo881a0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorMo881a0.moveToNext()) {
            try {
                listC.add(cursorMo881a0.getString(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3026b.m14999a(cursorMo881a0, th);
                    throw th2;
                }
            }
        }
        C1444v c1444v = C1444v.f4971a;
        AbstractC3026b.m14999a(cursorMo881a0, null);
        for (String triggerName : AbstractC1638q.m6756a(listC)) {
            AbstractC6118n.m27186d(triggerName, "triggerName");
            if (AbstractC6406h.m27557K(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db.mo888s("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Cursor m5b(AbstractC7462q db, InterfaceC0179j sqLiteQuery, boolean z7, CancellationSignal cancellationSignal) {
        AbstractC6118n.m27187e(db, "db");
        AbstractC6118n.m27187e(sqLiteQuery, "sqLiteQuery");
        Cursor cursorM33041x = db.m33041x(sqLiteQuery, cancellationSignal);
        if (!z7 || !(cursorM33041x instanceof AbstractWindowedCursor)) {
            return cursorM33041x;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM33041x;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? AbstractC0003a.m0a(cursorM33041x) : cursorM33041x;
    }

    /* JADX INFO: renamed from: c */
    public static final int m6c(File databaseFile) throws IOException {
        AbstractC6118n.m27187e(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i7 = byteBufferAllocate.getInt();
            AbstractC3026b.m14999a(channel, null);
            return i7;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(channel, th);
                throw th2;
            }
        }
    }
}
