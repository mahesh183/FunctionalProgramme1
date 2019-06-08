//merge sort algorithms
var arr=[4,6,8,4,12,7,45,67];
// /console.log(arr);
function mergeSort(arr)
{
    if(arr.length<2)
    return arr;
    var middle=Math.floor(arr.length/2);
    var left = arr.slice(0,middle);
    var right = arr.slice(middle,arr.length);
    //left=mergeSort(left);
    //right=mergeSort(right);
    return merge(mergeSort(left),mergeSort(right));
   // var brr=merge(mergeSort(left),mergeSort(right));
   // console.log(merge(mergeSort(left),mergeSort(right)));
}
function merge(left,right)
{
    var result =[];

    while((left.length) && (right.length))
    {
        if(left[0]<=right[0]){
            result.push(left.shift());
        }
        else{
            result.push(right.shift());
        }
    }
    while(left.length){
        result.push(left.shift());
    }
    while(right.length){
        result.push(right.shift());
    }
    console.log(result);
    return result;
}

mergeSort(arr);
