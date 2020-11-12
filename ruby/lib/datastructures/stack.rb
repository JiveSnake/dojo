#
# Stack implementation need to include these methods:
# push
# pop
# 
# You'll also need to make your stack accessible through :store
# 

class Stack
  attr_accessor :store

  def initialize
    @store = Array.new
  end
  
  def pop
    @store.pop
  end
  
  def push(element)
    @store.push(element)
    self
  end
end