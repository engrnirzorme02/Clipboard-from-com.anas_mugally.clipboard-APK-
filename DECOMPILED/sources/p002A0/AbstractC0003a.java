package p002A0;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1631j;
import p220c6.AbstractC3026b;

/* JADX INFO: renamed from: A0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0003a {
    /* JADX INFO: renamed from: a */
    public static final Cursor m0a(Cursor c7) throws IOException {
        AbstractC6118n.m27187e(c7, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c7.getColumnNames(), c7.getCount());
            while (c7.moveToNext()) {
                Object[] objArr = new Object[c7.getColumnCount()];
                int columnCount = c7.getColumnCount();
                for (int i7 = 0; i7 < columnCount; i7++) {
                    int type = c7.getType(i7);
                    if (type == 0) {
                        objArr[i7] = null;
                    } else if (type == 1) {
                        objArr[i7] = Long.valueOf(c7.getLong(i7));
                    } else if (type == 2) {
                        objArr[i7] = Double.valueOf(c7.getDouble(i7));
                    } else if (type == 3) {
                        objArr[i7] = c7.getString(i7);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i7] = c7.getBlob(i7);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            AbstractC3026b.m14999a(c7, null);
            return matrixCursor;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3026b.m14999a(c7, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static final int m1b(Cursor cursor, String str) {
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m2c(Cursor c7, String name) {
        AbstractC6118n.m27187e(c7, "c");
        AbstractC6118n.m27187e(name, "name");
        int columnIndex = c7.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c7.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : m1b(c7, name);
    }

    /* JADX INFO: renamed from: d */
    public static final int m3d(Cursor c7, String name) {
        String strR;
        AbstractC6118n.m27187e(c7, "c");
        AbstractC6118n.m27187e(name, "name");
        int iM2c = m2c(c7, name);
        if (iM2c >= 0) {
            return iM2c;
        }
        try {
            String[] columnNames = c7.getColumnNames();
            AbstractC6118n.m27186d(columnNames, "c.columnNames");
            strR = AbstractC1631j.m6721R(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e7) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e7);
            strR = "unknown";
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strR);
    }
}
